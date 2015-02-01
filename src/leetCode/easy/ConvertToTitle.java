package leetCode.easy;

public class ConvertToTitle
{

    public static void main(String[] args)
    {

        System.out.println(convertToTitle(676));
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
