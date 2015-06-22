package leetCode.easy;

/*
 Given an input string, reverse the string word by word.

 For example,
 Given s = "the sky is blue",
 return "blue is sky the".
 */
public class ReverseWords
{

    public static void main(String[] args)
    {
        System.out.println(reverseWords("the sky is blue"));

    }

    public static String reverseWords(String s)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("");
        String[] arr = s.trim().split("\\s+");
        for (int i = arr.length - 1; i > -1; i--)
        {
            sb.append(arr[i]);
            if (i != 0)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}
