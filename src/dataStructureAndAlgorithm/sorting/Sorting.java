package dataStructureAndAlgorithm.sorting;
import dataStructureAndAlgorithm.binaryHeap.BinaryMinHeap;

public class Sorting
{

    //交换排序，包括冒泡排序和快速排序；
    public static int[] bubbleSort(int[] source)
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
    
    public static int partition(int[] a, int left, int right)
    {
        if (a == null || a.length == 0)
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

    public static void quickSort1(int[] arr, int left, int right)
    {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array is empty.");

        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort1(arr, left, index - 1);
        if (index < right)
            quickSort1(arr, index + 1, right);
    }

   

   

    public static void printArray(int[] source)
    {
        for (int i = 0; i < source.length; i++)
        {
            System.out.print(source[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort2(int arr[], int left, int right) // 返回调整后基准数的位置
    {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Invalid Argument");

        if (left < right)
        {
            
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
            quickSort2(arr, left, i - 1); // 递归调用
            quickSort2(arr, i + 1, right);
        }
    }
    
    
 //插入排序： 包括直接插入排序和希尔排序   
    public static int[] insertSort(int[] source)
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
    
    public static void shellSort( int[] source )
    {
        if(source == null || source.length == 0)
            throw new IllegalArgumentException("Invalid Array");

        int j = 0, tmp = 0;
        for (int gap = source.length / 2; gap > 0; gap = gap / 2)
        {
            for (int i = gap; i < source.length; i++)
            {
                tmp = source[i];
                j = i;

                while (j >= gap && tmp < source[j - gap])
                {
                    source[j] = source[j - gap];
                    j = j - gap;
                }
                source[j] = tmp;
            }
        }

    }
    
    
    //选择排序：包括简单选择排序和堆排序
    
    public static void selectSort(int[] source)
    {
        if (source == null || source.length == 0)
            throw new IllegalArgumentException("Invalid Array");

        int tmp = 0;
        int position = 0;

        for (int i = 0; i < source.length; i++)
        {
            tmp = source[i];
            int j = i + 1;
            position = i;

            for (; j < source.length; j++)
            {
                if (source[j] < tmp)
                {
                    tmp = source[j];
                    position = j;
                }
            }
            source[position] = source[i]; 
            source[i] = tmp;

        }

    }

    public static void main(String[] args)
    {
        // int[] source = null;
        // int[] source = {};
        
        int[] source =
        { 24, -5, 7, 65, 3, 21, 18, -3, -2, -1 };
        // int[] source ={ 1, 2, 3, 6, 5, 7, 8, 9, 10 };

        System.out.println("Before Sorting:");
        printArray(source);

        System.out.println("\nAfter Sorting:");
        selectSort(source);
        printArray(source);
    }

}
