package leetCode;



public class MaxSubArray
{

    public static void main(String[] args)
    {

        int[] a = { 2,1,16,-6};
        
        System.out.println(maxSubArray(a));
    }

    public static int maxSubArray(int[] a)
    {
        int maxSum = a[0], curSum = a[0];
        for (int i = 1; i < a.length; ++i)
        {
            curSum += a[i];
            if(curSum < a[i])
                curSum = a[i];
            
            if(curSum > maxSum)
                maxSum = curSum;
        }
        
        return maxSum;
    }

}
