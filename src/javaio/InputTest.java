package javaio;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class InputTest
{

    public static void main(String[] args)
    {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        Class cls = InputTest.class;
        int c = 0;

        try
        {
            while (c != -1)
            {
                c = inputStreamReader.read();
                System.out.println((char) c);
                if(c==32)
                {
                    break;
                }
            }

            inputStreamReader.close();

        }
        catch (Exception e)
        {
        }

    }

}
