package leetCode.easy;

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
        {1,1,1,3,3,4};


        System.out.println(removeDuplicates(a));
 
    }

    /**
     * Keep two pointers. 
     * One for current valid last value, another for possible candidates. 
     * Keep comparing possible candidates with last value.
     **/
    public static int removeDuplicates(int[] A)
    {
        int len = A.length;
        if (len == 0)
            return 0;
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (A[i] == A[i - 1]) {
                continue;
            }else{
                A[count] = A[i];
                count++;
            }
        }
        return count;
    }

}
