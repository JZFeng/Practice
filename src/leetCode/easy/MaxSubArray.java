package leetCode.easy;

/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 */

public class MaxSubArray
{

    public static void main(String[] args)
    {

        int[] a = {-2,1,3,5,-7};
        
        System.out.println(maxSubArray1(a));
    }

    public static int maxSubArray1(int[] a)
    {
        if(a == null || a.length ==0)
            throw new IllegalArgumentException();
        
        int maxSum = a[0], curSum = a[0];
        int start = 0, end = 0;
        for (int i = 1; i < a.length; ++i)
        {
            curSum += a[i];
            if (curSum < a[i])
            {
                curSum = a[i];
                start = i;
            }

            if (curSum > maxSum)
            {
                maxSum = curSum;
                end = i;
            }
        }
        System.out.println("start index " + start);
        System.out.println("end index " + end);
        return maxSum;
    }

    public static int maxSubArray(int[] a)
    {
        if(a == null || a.length ==0)
            throw new IllegalArgumentException();
        
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        
        for (int i = 0; i < a.length; i++)
        {
            if(curSum >0)
                curSum += a[i];
            else
                curSum = a[i];
            
            if(curSum > maxSum)
                maxSum = curSum;
        }
        
        return maxSum;
        
    }
}
