package thisDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entry
{

    public static void main(String[] args)
    {
        new Person().eatApple(new Apple());
        Flower flower = new Flower();

        String s = null;
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
        catch (NumberFormatException e)// 当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常。
        {
            System.out.println(" 输入的不是数字 ");
        }
    }

}
