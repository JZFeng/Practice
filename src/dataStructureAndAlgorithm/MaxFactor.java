package dataStructureAndAlgorithm;

public class MaxFactor
{
    public static long gcd(long m, long n)
    {
        while (n != 0)
        {
            long rem = m % n;
            m = n;
            n = rem;
        }
        return m;
    }

    // Test program
    public static void main(String[] args)
    {
        System.out.println(45/10);
        System.out.println("gcd( 45, 10 ) = " + gcd(45, 10));
        System.out.println("gcd( 1989, 1590 ) = " + gcd(1989, 1590));
    }
}
