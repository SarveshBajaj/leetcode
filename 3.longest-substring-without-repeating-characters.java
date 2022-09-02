import java.util.HashSet;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> charSet = new HashSet<Character>();
        int startIndex = 0;
        int result = 0;
        for(int i = 0 ; i<n; i++){
            char ch = s.charAt(i);
            while(charSet.contains(ch) && startIndex<=i){
                charSet.remove(s.charAt(startIndex));
                startIndex++;    
            }
            result = Math.max(result, (i - startIndex)+1);
            charSet.add(ch);
        }
        return result;
    }
}
// @lc code=end

