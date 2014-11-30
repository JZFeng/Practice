package dataStructureAndAlgorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo
{

    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++)
        {
            al.add(new Integer(i));
        }

        
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext())
        {
            Integer tmp = itr.next();
            if(tmp%2 == 0)
            {
                itr.remove();
            }
        }
        
        itr = al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        
    }

}
