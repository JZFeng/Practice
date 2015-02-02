package leetCode.easy;

public class CountAndSay
{
    
    public static void main(String[] args)
    {
        System.out.println(countandSay(5));
    }
    
    public static String countandSay(int n)
    {
        String prev = "1";
        for (int i = 1; i < n; i++)
        {
            StringBuffer strBuf = new StringBuffer();
            int count = 0;
            for (int j = 0; j < prev.length(); j++)
            {
                if (j == 0 || prev.charAt(j) == prev.charAt(j - 1))
                {
                    count++;
                }
                else
                {
                    strBuf.append(String.valueOf(count));
                    strBuf.append(prev.charAt(j - 1));
                    count = 1;
                }
            }
            strBuf.append(String.valueOf(count));
            strBuf.append(prev.charAt(prev.length() - 1));
            prev = strBuf.toString();
        }
        return prev;
    }

}
