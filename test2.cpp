/**************************

Write a program to implement LRU page replacement algorithm.

***************************/

#include <bits/stdc++.h>
#include <queue>

using namespace std;

bool search(unordered_map<int, list<int>::iterator> frameSet, int key) {
    return frameSet.find(key) != frameSet.end();
}

void fcfsAlgo(vector<int> &pages, int numFrames) {
    int numPages = pages.size();
    list<int> frame;
    int numHits = 0;
	map<int, int> pageCount;

	for (int i = 0; i < numPages; i++) {
        boolean isPageFound = false;
        for(int j = 0;j<numFrames;i++){
            if(frame[j]==pages[i]){
                numHits++;
                isPageFound = true;
                break;
            }   
        }
        if(isPageFound == true)
            continue;
        if(frame.size() < numFrames){
            frame.push_front(pages[i]);
            auto it = pageCount.find(pages[i]);
            if(it == pageCount.end){  
                pageCount.insert(pair<int, int>(pages[i], 1));
            }
            else
                it->second += 1;
            continue;
        } else {
            int min = INT_MAX;
            int valueToRemove;
            for(int j = 0;j<frame.size();i++){
                auto it = pageCount.find(frame[j]);
                if(it == pageCount.end){  
                    valueToRemove = frame[j];
                    pageCount.insert(pair<int, int>(frame[j], 1));
                }
                else{
                    if(it->second < min){
                        min = it->second;
                        valueToRemove = frame[j];
                    }
                    it->second += 1;
                }
            }
            int replaceIndex = 0;
            for(int j = 0;j<frame.size();i++){
                if(frame[j] == valueToRemove)
                    replaceIndex = j;
            }
            frame[replaceIndex] = pages[i];
        }
    }  
    int numPageFaults = numPages - numHits;

    cout << endl;
	cout << "Hits: " << numHits << endl;
	cout << "Page faults: " << numPageFaults << endl;
	cout << "Hit Ratio: " << numHits / (float)numPages << endl;
	cout << "Miss Ratio: " << numPageFaults / (float)numPages << endl;
}
	
	


int main() {
	vector<int> refString;
	int numFrames;
	int numPages, page;
	cout << "Enter the number of frames: ";
	cin >> numFrames;
    cout << "Enter the number of pages: ";
    cin >> numPages;
	cout << "Enter the reference string: ";
	for (int i = 0; i < numPages; i++) {
	    cin >> page;
	    refString.push_back(page);
	}
	fcfsAlgo(refString, numFrames);
	
	return 0;
}