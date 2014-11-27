package dataStructureAndAlgorithm;

public class PowerX
{

    public static void main(String[] args)
    {
        System.out.println(pow1(2, 11));
        System.out.println(pow2(2, 11));
    }

    public static long pow1(int x, int n)
    {
        long result = 1;
        for (int i = 0; i < n; i++)
        {
            result *= x;
        }

        return result;
    }

    //O(1), reduce the number to half.
    public static long pow2(int x, int n)
    {
        long result = 0;
        
        if(n==0)
        {
            result = 1;
        }

        if (n == 1) // base case;
        {
            return (result = x);
        }

        if ((n % 2) == 0)
        {
//            result = pow2(x, n / 2) * pow2(x, n / 2); bad performance implementation
              result = pow2(x*x,n/2);
        }

        else if (n % 2 == 1)
        {
//            result = pow2(x, n / 2) * pow2(x, n / 2) * x; bad performance implementation
              result = pow2(x*x,n/2)*x;
        }

        return result;

    }

}
