package leetCode;

public class MergeSortedArrays
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;
        int[] b =
        { -1, 2 };
        merge(a, 3, b, 2);
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

    }

    // 从尾部开始，�?次比较尾部的值，根�?�大�?放到相应的�?置。m表明数组A中有m个元素。n表示数组b中有n个元素
    public static void merge(int A[], int m, int B[], int n)
    {
        int aIndex = m - 1;
        int bIndex = n - 1;
        int index = m + n - 1;

        while (aIndex >= 0 && bIndex >= 0)
        {
            if (A[aIndex] > B[bIndex])
            {
                A[index--] = A[aIndex--];
                /*
                 * A[index] = A[bIndex]; bIndex--; index--;
                 */

            }
            else
            {
                A[index--] = B[bIndex--];
            }
        }

        while (aIndex >= 0)
        {
            A[index--] = A[aIndex--];
        }

        while (bIndex >= 0)
        {
            A[index--] = B[bIndex--];
        }

    }

}
