package leetCode.easy;

public class ClimbStairs
{

    public static void main(String[] args)
    {
        System.out.println(climbStairs(15));
        System.out.println(climbStairs1(15));

    }

    public static int climbStairs1(int n)
    {
        int ways = 0;
        if (n <= 2)
            ways = n;

        if (n >= 3)
            ways = climbStairs1(n - 2) + climbStairs1(n - 1);
        
        return ways;
    }

    public static int climbStairs(int n)
    {
        if (n <= 2)
            return n;
        else
        {
            int[] ways = new int[n];
            ways[0] = 1;
            ways[1] = 2;
            for (int i = 2; i < n; i++)
            {
                ways[i] = ways[i - 1] + ways[i - 2];
            }

            return ways[n - 1];
        }

    }

}
