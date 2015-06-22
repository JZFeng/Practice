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
        
        System.out.println(maxSubArray(a));
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
