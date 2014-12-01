package javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufTest
{

    public static void main(String[] args)
    {
        // InputStreamReader把字节流转换为字符流；Reader是字符流；BufferedReader是有缓冲的字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String s = br.readLine() ;
            
            while (s.length() !=0)
            {
                System.out.println(s);
                s= br.readLine();
            }
            
            br.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}
