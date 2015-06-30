package dataStructure;

public class MaxSum
{
    public static void main(String[] args)
    {
        // int a[] ={ -4, -3, 5, 2, 1, 2,3};
        int a[] = { -4, -3, 5, -2, -1, 2, 6, -2 };

        System.out.println("MaxSum:" + maxSum(a));
    }

    
    public static int maxSum(int[] a)
    {
        if (a == null || a.length == 0)
            throw new IllegalArgumentException();

        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (curSum > 0)
                curSum += a[i];
            else
                curSum = a[i];

            if (curSum > maxSum)
                maxSum = curSum;
        }

        return maxSum;

    }

}
