package leetCode;

public class ReverseInt
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        StringBuilder sb  = new StringBuilder("I love steven"); 
        sb.reverse();
        System.out.println(sb);
        
                
        System.out.println(reverse(-123));
        

    }

    public static int reverse(int x)
    {

        int result = 0;

        while (x != 0)
        {
            int digit = x % 10;
            result = result * 10 + digit;
            x = x / 10;
        }

        return result;
    }
}
