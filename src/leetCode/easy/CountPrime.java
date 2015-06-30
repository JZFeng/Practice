package leetCode.easy;

/*
 Description:
 Count the number of prime numbers less than a non-negative number, n.
 */

public class CountPrime
{

    public static void main(String[] args)
    {
        System.out.println(Integer.bitCount(21));

    }

    public static int countPrime(int n)
    {
        int result = 0;
        int i = 2;
        while(i<=n)
        {
            
        }
      
        return result;
    }

    
    public static boolean isPrime(long n) {
        if (n <= 3) {
            return n > 1;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
     
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
