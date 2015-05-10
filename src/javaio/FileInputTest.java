package javaio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputTest
{

    public static void main(String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
        String s = br.readLine();
        while (s != null)
        {
            System.out.println(s);
            s = br.readLine();
        }

        br.close();

    }

}
