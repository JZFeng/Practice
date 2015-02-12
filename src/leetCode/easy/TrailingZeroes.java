package leetCode.easy;

public class TrailingZeroes
{
    
    public static void main(String args[])
    {
        System.out.println(trailingZeroes(30));
    }
    
    public static int trailingZeroes(int n) {
        int res = 0;  
        while(n > 0)  
        {  
            res = res + n/5;  
            n /= 5;  
        }  
        return res;  
    }  
    
    public static int fab(int n)
    {
        int res = 1;
        
        for (int i = 1; i <=n; i++)
        {
            res = res*i;
        }
        
        
        return res;
                
                
    }

}
