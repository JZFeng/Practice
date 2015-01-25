package leetCode;

public class LengthOfLastWord
{
    public static void main(String[] args)
    {
        String s = "Hello World   ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s)
    {
        int start = 0;
        s = s.trim();
        int length = s.length();
        for (int i = 0; i < length; i++)
        {
            char c = s.charAt(i);
            if (c == ' ')
            {
                start = i + 1;
            }

        }
        return (length - start);

    }

}
