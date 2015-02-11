package leetCode.easy;

public class TitleToNumber
{

    public static void main(String[] args)
    {

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

}