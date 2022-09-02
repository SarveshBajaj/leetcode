/*
 * @lc app=leetcode id=997 lang=java
 *
 * [997] Find the Town Judge
 */

// @lc code=start
class Solution {
    public int findJudge(int n, int[][] trust) {
        int trustFactor[] = new int[n+1];
        for(int i = 0;i<trust.length;i++){
            trustFactor[trust[i][1]]++;
            trustFactor[trust[i][0]]--;
        }
        for(int i = 1; i<=n;i++){
            if(trustFactor[i]==n-1)
                return i;
        }
        return -1;
    }
}
// @lc code=end

