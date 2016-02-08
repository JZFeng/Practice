package leetCode.easy;
/*
 Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
 */
public class TitleToNumber
{

    public static void main(String[] args)
    {

        testLoop();
        System.out.println(titleToNumber("YZ"));
        
    }
   

    public static int titleToNumber(String s)
    {
        if (s == null || s.length() == 0)
            return -1;
        int length = s.length();
        char c;
        int result = 0;

        for (int i = 0; i < length; i++)
        {
            c = s.charAt(i);
            result += (c - 'A' + 1) * Math.pow(26, length - i - 1);
        }

        return result;
    }
    
    public static void testLoop()
    {
        for (int m = 0; m < 3; m++)
        {
            for (int n = 0; n < 3; n++)
            {
                for(int i = m*3;i<m*3+3;i++)
                {
                    for(int j = n*3;j >j*3+3;j++)
                    {
                        System.out.println("a"+"["+i+"]"+"["+j+"]");
                    }
                }
            }
        }
    }
}
