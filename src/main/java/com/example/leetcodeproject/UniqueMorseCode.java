package com.example.leetcodeproject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueMorseCode {

    public static int uniqueMorseRepresentations(String[] words) {
        List<String> wordsList = Arrays.asList(words);

        String[] listOfMorse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};


        List<String> morseList = Arrays.asList(listOfMorse);
        Set<String> set = new HashSet<>();
        for(int i = 0; i<wordsList.size();i++){
            String temp = "";
            for(int j = 0; j<wordsList.get(i).length();j++){
                temp += morseList.get(wordsList.get(i).charAt(j)-97);
            }
            set.add(temp);
        }

        return set.size();
    }
}
