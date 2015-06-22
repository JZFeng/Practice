package dataStructure;

public class MaxFactor
{
    public static long commonDivision(long a, long b)
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
    
    public static long commonMultiple(long a, long b)
    {
        return a*b/commonDivision(a, b);
    }

    // Test program
    public static void main(String[] args)
    {
        System.out.println(commonDivision(42, 12));
        System.out.println(commonMultiple(42, 12));
    }
}
