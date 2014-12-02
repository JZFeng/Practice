package dataStructureAndAlgorithm;

import java.util.LinkedList;

public class LinkedListDemo
{

    public static void main(String[] args)
    {
        LinkedList<String> lst = new LinkedList<String>();
        lst.add("Hello");
        lst.add("Java");
        lst.add("World");
        lst.add("Beijing");
        lst.add("Tom");
        int size = lst.size();
        System.out.println((10 >> 1));
        System.out.println((size));

        // index starts from 0; index excluses header
        System.out.println(lst.indexOf("Java"));

    }

}
