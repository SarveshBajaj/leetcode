import java.util.Scanner;

public class CF1556A{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int c,d;
            c = in.nextInt();
            d = in.nextInt();
            if(c == 0 && d == 0)
                System.out.println(0);
            else if(Math.abs(d-c) %2 == 1)
                System.out.println(-1);
            else if(c == d)
                System.out.println(1);
            else
                System.out.println(2);
        }
        in.close();
    }
}