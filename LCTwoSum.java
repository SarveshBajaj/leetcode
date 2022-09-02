import java.util.Arrays;

class LCTwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] dup = nums.clone();
        Arrays.sort(nums);
        int val1 = 0,val2 = 0;
        for(int i = 0, j = nums.length-1;i<nums.length && j>=0;){
            if(i == j)
                break;
            if(nums[i]+nums[j] == target){
                val1 = nums[i];
                val2 = nums[j];
                break;
            }
            else if(nums[i]+nums[j] > target)
                j--;
            else
                i++;
        }
        int ind1=0,ind2=0;
        for(int i = 0;i<dup.length;i++){
            if(val1 == dup[i])
                ind1 = i;
            else if(val2 == dup[i])
                ind2 = i;
        }
        return new int[] {ind1,ind2};
    }
    public static void main(String[] args){
        LCTwoSum.twoSum(new int[] {2,5,5,11}, 10);
    }
}