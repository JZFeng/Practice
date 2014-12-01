package javalib;

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;

public class TestEncoding
{
    public static void main(String[] args) throws UnsupportedEncodingException
    {
        
        Enumeration e = System.getProperties().propertyNames();
        while (e.hasMoreElements())
        {
            Object object = (Object) e.nextElement();
            System.out.println(object +" :-"+ System.getProperty((object.toString())));
        }
        
        
        System.out.println("转码前，输出Java系统属性如下：");
        System.out.println("user.country:" + System.getProperty("user.country"));
        System.out.println("user.language:" + System.getProperty("user.language"));
        System.out.println("sun.jnu.encoding:" + System.getProperty("sun.jnu.encoding"));
        System.out.println("file.encoding:" + System.getProperty("file.encoding"));

        System.out.println("---------------");
        String s = "熔岩博客";
        String s1 = new String(s.getBytes(), "UTF-8");
        String s2 = new String(s.getBytes("UTF-8"), "UTF-8");
        String s3 = new String(s.getBytes("UTF-8"));
        String s4 = new String(s.getBytes("UTF-8"), "GBK");
        String s5 = new String(s.getBytes("GBK"));
        String s6 = new String(s.getBytes("GBK"), "GBK");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}