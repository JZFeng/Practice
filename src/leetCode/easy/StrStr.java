package leetCode.easy;
/*
 Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class StrStr
{

    public static void main(String[] args)
    {
        System.out.println(strStr("Hello World", "World"));
    }

   
    public static int strStr(String haystack, String needle)
    {
        return haystack.indexOf(needle);
    }
}
