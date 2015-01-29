package leetCode;

public class PalindromeNumber
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println(isPalindromeNumber(121));

    }
    
    public static boolean isPalindromeNumber(int x)
    {
        if(x<0)
            return false;
        if(x==0)
            return true;
        if(x!=0 && x%10 ==0)
            return false;
        
        int tmp = x;
        int reverseX = 0;
        while(x>0)
        {
            int digit = x%10;
            reverseX = reverseX*10 + digit;
            x=x/10;
        }
        
        if(reverseX == tmp)
            return true;
        
        return false;
    }
    

}
