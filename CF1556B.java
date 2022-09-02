import java.util.ArrayList;
import java.util.Scanner;

public class CF1556B {
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int countEven = 0, countOdd = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();
            while(n-- > 0){
                int value = in.nextInt();
                arrayList.add(value);
                if(value %2 == 0)
                    countEven ++;
                else
                    countOdd ++;
            }
            if(Math.abs(countEven - countOdd) > 1){
                System.out.println(-1);
            }else{
                int sum = 0;
                if(countEven > countOdd){
                    sum = returnEvenSum(arrayList);
                }else if(countOdd > countEven){
                    sum = returnOddSum(arrayList);
                }else{
                    sum = Math.min(returnEvenSum(arrayList), returnOddSum(arrayList));
                }
                System.out.println(sum);
            }
        }
        in.close();
    }

    public static int returnEvenSum(ArrayList<Integer> arrayList){
        int evenNumber = 0, sum = 0;
        for(int i = 0; i < arrayList.size();i++){
            if(arrayList.get(i) % 2 == 0){
                sum+= Math.abs(evenNumber-i);
                evenNumber+=2;
            }
        }
        return sum;
    }

    public static int returnOddSum(ArrayList<Integer> arrayList){
        int oddNumber = 0, sum = 0;
        for(int i = 0; i < arrayList.size();i++){
            if(arrayList.get(i) % 2 != 0){
                sum+= Math.abs(oddNumber-i);
                oddNumber+=2;
            }
        }
        return sum;
    }
}
