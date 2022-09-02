import java.util.ArrayList;

public class LCSquareOfSortedArray {

    public static int[] sortedSquares(int[] nums) {
        ArrayList<Integer> negVals = new ArrayList<>();
        ArrayList<Integer> posVals = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<0)
                negVals.add(nums[i]*nums[i]);
            else
                posVals.add(nums[i]*nums[i]);
        }
        int count = 0;
        int negCount = negVals.size()-1;
        int index = 0;
        while(count<posVals.size() && negCount>=0){
            if(posVals.get(count) > negVals.get(negCount)){
                nums[index++] = posVals.get(count++);
            }else{
                nums[index++] = negVals.get(negCount--);
            }
        }
        while(negCount >= 0){
            nums[index++] = negVals.get(negCount--);
        }
        while(count < posVals.size()){
            nums[index++] = posVals.get(count++);
        }
        return nums;
    }

    public static void main(String[] args){
        LCSquareOfSortedArray.sortedSquares(new int[] {-1});
    }
}
