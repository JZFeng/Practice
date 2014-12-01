package dataStructureAndAlgorithm.sorting;

public class SortTest
{

    public static void main(String[] args)
    {
        // int[] source = {14,1,4,-12,5,2,8,12,7,1,-9};
        int[] source =
        {};

        System.out.println("Before sorting: ");
        printArray(source);

        System.out.println("After sorting: ");
        printArray(BubbleSort.sort(source));

        int sum = 0;
        for (int i = 1; i <= 100; i++)
        {
            sum += i;
        }

        System.out.println(sum);
        System.out.println(f(10));
        System.out.println(g(2));
        System.out.println(h(3));
    }

    public static int f(int n)
    {
        if (n <= 0)
        {
            return n;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
        {
            return f(n - 1) * n;
        }

    }

    // 只和i有关
    public static double g(int n)
    {
        double result = 0;
        for (int i = 1; i <= n; i++)
        {
            result += 1/(i*(i+1));
        }
        return result;

    }
    
    
    // 只和i有关
    public static double h(int n)
    {
        double result = 0;
        for (int i = 1; i <= n; i++)
        {
            result += Math.pow(i, 3);
        }
        return result;

    }


    public static void printArray(int[] array)
    {
        if (array == null || array.length == 0)
        {
            return;
        }

        int length = array.length;
        for (int i = 0; i < length; i++)
        {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

}
