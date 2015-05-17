package thisDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Entry
{

    public static void main(String[] args) throws UnsupportedEncodingException
    {
        System.out.println( System.getProperty("file.encoding"));
        String s = "我是冯建中";
        String s1 = new String(s.getBytes("UTF-8"),"UTF-8");
        System.out.println(s1);
        new Person().eatApple(new Apple());
        Flower flower = new Flower();

        InputStreamReader re = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(re);
        try
        {
            s = br.readLine();
            System.out.println("s= " + Integer.parseInt(s));
            br.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (NumberFormatException e)// ��Ӧ�ó�����ͼ���ַ�ת����һ����ֵ���ͣ������ַ���ת��Ϊ�ʵ���ʽʱ���׳����쳣��
        {
            System.out.println(" ����Ĳ������� ");
        }
        
       
    }

}
