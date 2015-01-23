package dataStructure;

public class MaxFactor
{
    public static long gcd(long a, long b)
    {
        
        if(a<b)
        {
            long tmp = a;
            a= b;
            b= tmp;
        }
        
        while (b!=0)
        {
            long rem = a % b;
            a = b;
            b = rem;
        }
        
        return a;
        
    }

    // Test program
    public static void main(String[] args)
    {
        System.out.println(gcd(45, 39));
    }
}
