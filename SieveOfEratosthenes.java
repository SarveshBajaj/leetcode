

public class SieveOfEratosthenes{

    public static int countPrimes(int n){
        boolean[] sieve = new boolean[n+1];   
        if(n==0 || n==1)
            return 0;
        int p = 2;
        while(p*p<=n)
        {
            for (int i = p*p; i<=n ; i+=p){
            if(sieve[i])
                continue;
            sieve[i]=true;
            }
            p++;
        }
        int count = 0;
        for(int i = 2;i<n;i++){
            if(sieve[i]==false)
                count ++;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countPrimes(10));
        System.out.println(countPrimes(0));
        System.out.println(countPrimes(1));
    }
    
}