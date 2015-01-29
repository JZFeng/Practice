package leetCode.easy;

public class LongestCommonPrefix
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

    public String longestCommonPrefix(String[] strs)
    {
        if (strs.length == 0)
            return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; ++i)
        {
            if (prefix.length() == 0 || strs[i].length() == 0)
                return "";

            int len = prefix.length() < strs[i].length() ? prefix.length() : strs[i]
                    .length();

            int j;

            for (j = 0; j < len; ++j)
            {
                if (prefix.charAt(j) != strs[i].charAt(j))
                    break;
            }

            prefix = prefix.substring(0, j);

        }

        return prefix;
    }

}
