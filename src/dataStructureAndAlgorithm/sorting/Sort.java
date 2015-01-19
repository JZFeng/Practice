package dataStructureAndAlgorithm.sorting;

public class Sort
{

    public static int partition1(int[] a, int left, int right)
    {
        if(a == null || a.length == 0 )
            throw new IllegalArgumentException("Invalid Array");
        
        int i = left;
        int j = right;
        int pivot = a[(left + right) / 2];
        int tmp = 0;

        while (i <= j)
        {
            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;

            if (i <= j)
            {
                tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
            }
        }

        return i;

    }

    public static int partition2(int[] a, int left, int right)
    {
        if(a == null || a.length == 0 )
            throw new IllegalArgumentException("Invalid Array");

        
        int pivot = a[left];
        int i = left;
        int j = right;
        int tmp = 0;

        while (i <= j)
        {
            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;

            if (i <= j)
            {
                tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
            }
        }

        return i;

    }
    
    
    public static void QuickSort1(int[] a, int left, int right)
    {
        if (a == null || a.length == 0)
            throw new IllegalArgumentException("Array is empty.");

        int index = partition1(a, left, right);
        if (left < index - 1)
            QuickSort1(a, left, index - 1);
        if (index < right)
            QuickSort1(a, index+1, right);
    }

    public static int[] BubbleSort(int[] source)
    {
        if (source == null || source.length == 0)
            throw new IllegalArgumentException("Array is empty.");

        int tmp = 0;
        for (int i = 0; i < source.length - 1; i++)
        {
            for (int j = 0; j < source.length - i - 1; j++)
            {
                if (source[j] > source[j + 1])
                {
                    tmp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = tmp;
                }
            }
        }

        return source;

    }

    public static int[] InsertSort(int[] source)
    {
        if (source == null || source.length == 0)
            throw new IllegalArgumentException("Array is empty.");

        int key = 0, j = 0;

        for (int i = 1; i < source.length; i++)
        {
            key = source[i];
            j = i - 1;
            while (j >= 0 && source[j] > key)
            {
                source[j + 1] = source[j];
                j--;
            }

            source[j + 1] = key;
        }

        return source;

    }

    public static void printArray(int[] source)
    {
        for (int i = 0; i < source.length; i++)
        {
            System.out.print(source[i] + " ");
        }
    }

    public static void QuickSort2(int arr[], int left, int right) // 返回调整后基准数的位置
    {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Invalid Argument");

        if (left < right)
        {
            // Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = left, j = right, x = arr[left];
            while (i < j)
            {
                while (i < j && arr[j] >= x)
                    // 从右向左找第一个小于x的数
                    j--;
                if (i < j)
                {
                    arr[i] = arr[j];
                    i++;
                }

                while (i < j && arr[i] < x)
                    // 从左向右找第一个大于等于x的数
                    i++;
                if (i < j)
                {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = x;
            QuickSort2(arr, left, i - 1); // 递归调用
            QuickSort2(arr, i + 1, right);
        }
    }

    public static void main(String[] args)
    {
        // int[] source = null;
        // int[] source = {};
         int[] source = { 24, -5, 7, 65, 3, 21, 18, -3, -2, -1 };
//        int[] source ={ 1, 2, 3, 6, 5, 7, 8, 9, 10 };
        
        System.out.println("Before Sorting:");
        printArray(source);

        System.out.println("\nAfter Sorting:");
        QuickSort1(source, 0, source.length - 1);
        printArray(source);
    }

}
