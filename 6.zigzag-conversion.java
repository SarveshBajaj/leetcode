import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution {
    public static String convert(String s, int numRows) {
        HashMap<Integer, ArrayList<Character>> map = new HashMap<Integer, ArrayList<Character>>();
        if(s.length()==1)
            return s;
        for(int i = 0; i<s.length();i+=(numRows*2 -2)){
            for(int j = 0;j<numRows && i+j<s.length();j++){
                if(map.containsKey(j)){
                    map.get(j).add(s.charAt(i+j));
                }else{
                    map.put(j, new ArrayList<>(Arrays.asList(s.charAt(i+j))));
                }
            }
            for(int j = numRows; j<(numRows*2-2) && i+j<s.length();j++){
                map.get(numRows*2-2-j).add(s.charAt(i+j));
            }
        }
        StringBuilder str = new StringBuilder();
        for(Map.Entry<Integer, ArrayList<Character>> entry : map.entrySet()){
            for(char ch : entry.getValue()){
                str.append(ch);
            }
        }
        return str.toString();
    }
}
// @lc code=end

