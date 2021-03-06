package leetCode.easy;

/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 */
public class IsPalindrome
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        System.out.println(isPalindrome("****A man, a plan, a canal: Panama"));

    }

    public static boolean isPalindrome(String s)
    {
     
        if(s == null || s.length() <=1)
            return true;
        
        
        s = s.toLowerCase();
        int length = s.length();
        int i = 0 , j = length -1 ;
        char l_c, r_c;
        
        while (i < j)
        {
            l_c = s.charAt(i);
            if(!isAlphaNumeric(l_c))
            {
                i++;
                continue;
            }
            
            r_c = s.charAt(j);
            if(!isAlphaNumeric(r_c))
            {
                j--;
                continue;
            }
            
            if(l_c == r_c)
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
            
        }
        
        return true;
        
    }

    public static boolean isAlphaNumeric(char c)
    {
        if((c>='a' && c <= 'z') || (c>='A' && c <= 'A') || (c>='0' && c <= '9') )
            return true;
        return false;
    }

}
