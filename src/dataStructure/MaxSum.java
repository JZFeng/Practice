package dataStructure;

public class MaxSum
{
    public static void main(String[] args)
    {
        // int a[] ={ -4, -3, 5, 2, 1, 2,3};
        int a[] =
        { -4, -3, 5, -2, -1, 2, 6, -2 };

        System.out.println("MaxSum:"+ maxSum2(a));
    }

    /** �����е������к�,ʱ�临�Ӷ���O(N^2)*/
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

   
    
    /*
     *  ���Ž������,ʱ�临�Ӷ���O(N)
     *  int[] a = { 4, -3, 5, -2, -1, 2, 6, -2 };
   */
    public static int maxSum2(int[] a)
    {
        if (a == null || a.length == 0)
        {
            System.out.println("Invalid Sequence");
            return 0;
        }

        int thisSum = 0;
        int maxSum = 0;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < a.length; i++)
        {
            thisSum += a[i];
            if (thisSum > maxSum)
            {
                maxSum = thisSum;
                endIndex = i;
            }
            else if (thisSum < 0)
            {
                thisSum = 0;
                startIndex = i + 1;
            }
        }

        System.out.println("From " + startIndex + " to " + endIndex);
        for (int z = startIndex; z <= endIndex; z++)
        {
            System.out.println(a[z]);
        }
        return maxSum;

    }

 /*
  * division and conquer���η�����Ҫ�õݹ飬�Ѵ������ֽ��С�����⡣
  * */
    public static int maxSum3(int[] a, int left, int right)
    {
        if (left == right)
            if (a[left] > 0)
            {
                return a[left];
            }
            else
                return 0;

        int center = (left + right) / 2;

        int leftMaxSubSum = maxSum3(a, left, center);
        int rightMaxSubSum = maxSum3(a, center + 1, right);

        int maxLeftBoarderSum = 0;
        int leftBoarderSum = 0;
        for (int i = center; i >= left; i--)
        {
            leftBoarderSum += a[i];
            if (leftBoarderSum > maxLeftBoarderSum)
                maxLeftBoarderSum = leftBoarderSum;
        }

        int rightBoarderSum = 0;
        int maxRightBoarderSum = 0;
        for (int i = center + 1; i <= right; i++)
        {
            rightBoarderSum += a[i];
            if (rightBoarderSum > maxRightBoarderSum)
                maxRightBoarderSum = rightBoarderSum;
        }

        return max3(leftMaxSubSum, rightMaxSubSum, maxLeftBoarderSum + maxRightBoarderSum);

    }

    public static int max3(int a, int b, int c)
    {
        int tmp = a > b ? a : b;
        return tmp > c ? tmp : c;

    }
    
    


}
