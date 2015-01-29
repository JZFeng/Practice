package dataStructure;

public class BSearch
{
    static int NOTFOUND = -1;

    public static void main(String[] args)
    {
        int[] a =
        { 1, 3, 5, 7, 9 };
        System.out.println(binarySearch(a, 3));
    }

    public static int binarySearch(int[] a, int x)
    {
        if (a == null || a.length == 0)
        {
            return -1;
        }

        int low = 0;
        int high = a.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;

            if (a[mid] == x)
            {
                return mid;
            }

            else if (a[mid] > x)
            {
                high = mid - 1;
            }
            else if (a[mid] < x)
            {
                low = mid + 1;
            }
        }

        return -1;

    }
}
