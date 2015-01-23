package leetCode;



public class MaxSubArray
{

    public static void main(String[] args)
    {

        int[] a = {-2,1};
        
        System.out.println(maxSubArray(a));
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
