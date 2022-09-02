/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        if(x == -1*Math.pow(2,31))
            return 0;
        boolean isNegative = x<0?true:false;
        if(isNegative)
            x*=-1;
        int result = 0;
        while(x>0){
            result = result*10 + x%10;
            x/=10;
        }
        if (isNegative)
            result *= -1;
        return result;
    }
}
// @lc code=end

