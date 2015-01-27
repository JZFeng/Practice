package leetCode;

import java.util.LinkedList;

/*
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array A = [1,1,2],

 Your function should return length = 2, and A is now [1,2].

 https://oj.leetcode.com/problems/remove-duplicates-from-sorted-array/
 * */
public class RemoveDuplicates
{

    public static void main(String[] args)
    {
        int a[] = new int[]
        {};


        System.out.println(removeDuplicates(a));
 /*       LinkedList<Integer> ll = removeDuplicates1(a);

        for (Integer integer : ll)
        {
            System.out.print(integer + ",");
        }*/
    }

    /**
     * Keep two pointers. 
     * One for current valid last value, another for possible candidates. 
     * Keep comparing possible candidates with last value.
     **/
    public static int removeDuplicates(int[] a)
    {
        if (a == null || a.length == 0)
            return 0;

        int k = 0;
        for (int i = 1; i < a.length; i++)
        {
            if (a[i - 1] != a[i])
            {
                k++;
                a[k] = a[i];
            }

        }
        return k + 1;
    }

    public static LinkedList<Integer> removeDuplicates1(int[] a)
    {
        if (a == null || a.length == 0)
            return null;

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(new Integer(a[0]));

        for (int i = 1; i < a.length; i++)
        {
            if (a[i] != a[i - 1])
                ll.add(new Integer(a[i]));
        }

        return ll;
    }
}
