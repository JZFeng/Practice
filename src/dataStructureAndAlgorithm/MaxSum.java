package dataStructureAndAlgorithm;
public class MaxSum
{
    public static void main(String[] args)
    {
        // int a[] ={ -4, -3, 5, 2, 1, 2,3};

        int a[] =
        { 4, -3, 5, -2, -1, 2, 6, -2 };

  
        System.out.println(maxSum3(a, 0, a.length-1));
    }

    // 求所有的子序列和,时间复杂度是O(N^2)
    public static int maxSum1(int[] a)
    {
        if (a == null || a.length == 0)
        {
            System.out.println("Invalid Sequence");
            return 0;
        }

        int i, j;
        int maxSum = 0;
        int thisSum;

        for (i = 0; i < a.length; i++)
        {
            thisSum = 0;
            for (j = i; j < a.length; j++)
            {
                thisSum += a[j];
                if (thisSum > maxSum)
                {
                    maxSum = thisSum;
                }
            }
        }

        return maxSum;
    }

    // 最优解决方案,时间复杂度是O(N)
    // int[] a = { 4, -3, 5, -2, -1, 2, 6, -2 };

 
    public static int maxSum2(int[] a)
    {
        if (a == null || a.length == 0)
        {
            System.out.println("Invalid Sequence");
            return 0;
        }

        int thisSum = 0;
        int maxSum = 0;
        int j;
        int startIndex = 0;
        int endIndex = 0;

        for (j = 0; j < a.length; j++)
        {
            thisSum += a[j];
            if (thisSum > maxSum)
            {
                maxSum = thisSum;
                endIndex = j ;

            }
            else if (thisSum < 0)
            {
                thisSum = 0;
                startIndex = j+1;

            }

        }

        System.out.println("From " + startIndex + " to " + endIndex);
        for (int z = startIndex; z <= endIndex; z++)
        {
            System.out.println(a[z]);
        }
        return maxSum;

    }
   
    //分治法必须要用递归，把大的问题分解成小的问题。
  
    public static int maxSum3(int[] a, int left, int right)
    {
        if(left == right)
            if(a[left]>0)
            {
                return a[left];
            }
            else return 0;
    

        int center = (left + right ) / 2;
        
        int leftMaxSubSum = maxSum3(a, left, center);
        int rightMaxSubSum = maxSum3(a, center + 1, right);
        
        int maxLeftBoarderSum = 0;
        int leftBoarderSum = 0;
        for(int i = center;i>= left ; i--)
        {
           leftBoarderSum += a[i];
           if(leftBoarderSum > maxLeftBoarderSum)
               maxLeftBoarderSum = leftBoarderSum;
        }

        
        int rightBoarderSum = 0;
        int maxRightBoarderSum = 0;
        for(int i=center+1;i<=right; i++)
        {
            rightBoarderSum += a[i];
            if(rightBoarderSum>maxRightBoarderSum)
                maxRightBoarderSum = rightBoarderSum;
        }
        
        return max3(leftMaxSubSum, rightMaxSubSum, maxLeftBoarderSum+maxRightBoarderSum);
        
    }
    
    
    
    public static int max3(int a, int b, int c)
    {
        int tmp = a>b ? a: b;
        return tmp>c? tmp:c;
        
    }
    
    

}
