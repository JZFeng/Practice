package leetCode.easy;

/*
 Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example,
Given s = "Hello World",
return 5.
 */
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
