package leetCode.easy;

import java.util.HashMap;
/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 */
import java.util.Iterator;
public class MajorityElement<E>
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] a = {1,2,2,2,4,5,6,3,3,2};
        System.out.println(majorityElement(a));

    }

    //hashMap
    public static int majorityElement(int[] num)
    {
        if (num.length == 0)
            throw new IllegalArgumentException();

        if (num.length == 1)
            return num[0];

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < num.length; i++)
        {
            if (!hm.containsKey(num[i]))
                hm.put(num[i], 1);
            else
            {
                hm.put(num[i], hm.get(num[i]) + 1);
            }
        }

        Iterator<Integer> itr = hm.keySet().iterator();
        int key = itr.next();
        int maxCount = hm.get(key);
        int tmpKey, count;
        while (itr.hasNext())
        {
            tmpKey = itr.next();
            count = hm.get(tmpKey);

            if (maxCount < count)
            {
                key = tmpKey;
                maxCount = count;
            }
        }

        System.out.println("Max Number is: " + key + ", count is " + maxCount);
        return key;

    }

}
