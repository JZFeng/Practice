package dataStructure.sorting;

import dataStructure.binaryHeap.BinaryMinHeap;

public class Sort
{

    // 交�?�排�?，包括冒泡排�?和快速排�?；
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

    public static void quickSort2(int arr[], int left, int right) // 返回调整�?�基准数的�?置
    {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Invalid Argument");

        if (left < right)
        {

            int i = left, j = right, x = arr[left];

            while (i < j)
            {
                while (i < j && arr[j] >= x)
                    // 从�?��?�左找第一个�?于x的数
                    j--;
                if (i < j)
                {
                    arr[i] = arr[j];
                    i++;
                }

                while (i < j && arr[i] < x)
                    // 从左�?��?�找第一个大于等于x的数
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

    // �?�入排�?： 包括直接�?�入排�?和希尔排�?
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

    public static void shellSort(int[] source)
    {
        if (source == null || source.length == 0)
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

    // 选择排�?：包括简�?�选择排�?和堆排�?

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

    public static void heapSort(int[] array)
    {
        buildHeap(array);// 构建堆
        int n = array.length;
        int i = 0;
        for (i = n - 1; i >= 1; i--)
        {
            swap(array, 0, i);
            siftDown(array, 0, i);
        }
    }

    public static void buildHeap(int[] array)
    {
        int n = array.length;// 数组中元素的个数
        for (int i = n / 2 - 1; i >= 0; i--)
            siftDown(array, i, n);

    }

    public static void siftDown(int[] source, int index, int max)
    {
        int left = 2 * index + 1;// 左孩�?的下标（如果存在的�?）
        int right = 2 * index + 2;// 左孩�?的下标（如果存在的�?）

        int largest = 0;// 寻找3个节点中最大值节点的下标
        if (left < max && source[left] > source[index])
            largest = left;
        else
            largest = index;
        if (right < max && source[right] > source[largest])
            largest = right;

        if (largest != index)
        {
            swap(source, largest, index);
            siftDown(source, largest, max);
        }

    }

    public static void swap(int[] array, int i, int j)
    {
        int temp = 0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    


    public static void bucketSort(int[] data, int min, int max)
    {
        // 缓存数组
        int[] tmp = new int[data.length];
        // buckets用于记录待排�?元素的信�?�
        // buckets数组定义了max-min个桶
        int[] buckets = new int[max - min];
        // 计算�?个元素在�?列出现的次数
        for (int i = 0; i < data.length; i++)
        {
            buckets[data[i] - min]++;
        }
        // 计算“�?�入�?�?�桶内的元素在有�?�?列中的�?置
        for (int i = 1; i < max - min; i++)
        {
            buckets[i] = buckets[i] + buckets[i - 1];
        }
        // 将data中的元素完全�?制到tmp数组中
        System.arraycopy(data, 0, tmp, 0, data.length);
        // 根�?�buckets数组中的信�?�将待排�?列的�?�元素放入相应�?置
        for (int k = data.length - 1; k >= 0; k--)
        {
            data[--buckets[tmp[k] - min]] = tmp[k];
        }
    }

       

    
    
    public static void main(String[] args)
    {
        // int[] source = null;
        // int[] source = {};

//        int[] source ={ 24, -5, 7, 65, 3, 21, 18, -3, -2, -1 };
      
         int[] source ={ 1, 2, 3, 6, 5, 7, 8, 9, 10 };

        System.out.println("Before Sorting:");
        printArray(source);

        System.out.println("\nAfter Sorting:");
        bucketSort(source,0,11);
        printArray(source);
    }

}
