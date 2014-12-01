package javalib;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.jar.JarFile;

public class HashDemo
{

    public static void main(String[] args)
    {
        Hashtable<String, Integer> hashTable = new Hashtable<String, Integer>();
        hashTable.put("1", new Integer(1));
        hashTable.put("10", new Integer(10));
        hashTable.put("11", new Integer(11));
        hashTable.put("25", new Integer(25));
        Enumeration<String> emunation = hashTable.keys();
        while (emunation.hasMoreElements())
        {
            String string = (String) emunation.nextElement();
            System.out.println(hashTable.get(string));
        }
        
       

    }

}
