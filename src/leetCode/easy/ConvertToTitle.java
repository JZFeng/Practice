package leetCode.easy;
/*
 Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
        本质上就是将一个10进制数转换为一个26进制的数 
 */

public class ConvertToTitle
{

    public static void main(String[] args)
    {
        System.out.println(convertToTitle(26));
    }

    public static String convertToTitle(int n)
    {
        StringBuilder sb = new StringBuilder();
        int val = 0;
        while (n > 0)
        {
            n--;
            val = n % 26;
            sb.insert(0, (char) ('A' + val));
            n /= 26;
        }
        return sb.toString();
    }

}
