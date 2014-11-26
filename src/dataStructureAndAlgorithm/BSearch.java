package dataStructureAndAlgorithm;

public class BSearch
{
    static int NOTFOUND = -1;

    public static void main(String[] args)
    {
        int[] a =
        { 1, 3, 5, 7, 9 };
        System.out.println(binarySearch(a, 10));
    }

    public static int binarySearch(int[] a, int x)
    {
        if (a == null || a.length == 0)
        {
            return NOTFOUND;
        }

        int low = 0;
        int high = a.length - 1;

        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (a[mid] == x)
                return mid;
            else if (x < a[mid])
                high = mid - 1;
            else if (x > a[mid])
                low = mid + 1;
        }

        return NOTFOUND;

    }

}
