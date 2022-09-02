import javax.naming.spi.DirStateFactory.Result;

/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        String res = null;
        for(int i = n-1;i>=0;i--){
            for(int j = i;j<n;j++){
                dp[i][j] = (s.charAt(i)==s.charAt(j) && 
                            ((j-i)<3 || dp[i+1][j-1])
                            );
                if(dp[i][j] && (res == null || (j-i+1) > res.length())){
                    res=s.substring(i, j+1);
                }
            }
        }
        return res;
    }
}
// @lc code=end

