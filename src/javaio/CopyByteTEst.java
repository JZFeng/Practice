package javaio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CopyByteTEst
{

    public static void main(String[] args) throws IOException
    {

        /*
         * FileInputStream in = null; 
         * FileOutputStream out = null;
         * in = new FileInputStream("IMG_7145.JPG"); 
         * out = new FileOutputStream("copy.JPG");
         * 
         * int c = in.read(); 
         * while (c != -1)
         * { out.write(c); c = in.read(); }
         * in.close(); 
         * out.close();
         */

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "IMG_7145.JPG"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                "copy.JPG"));
        int c = bis.read();
        while (c != -1)
        {
            bos.write(c);
            c = bis.read();
        }

        bis.close();
        bos.close();

    }

}
