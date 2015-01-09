package dataStructureAndAlgorithm.hashing;

public class stringHash
{

    public static void main(String[] args)
    {
        String s = "Hello";
        System.out.println(isPrime(11));
        

    }
    
    public static int hashCode(String s)
    {
        int h = 0;
        char[] values =  s.toCharArray();

        
        for(int i = 0; i < values.length; i++)
        {
            h = h*31 + values[i];
        }
        
        
        
        return h;
        
    }
    
    public static boolean isPrime(int n)
    {
        if(n<2)
            return false;
        
        if(n == 2 || n == 3)
            return true;
        
        if(n%2 == 0)
            return false;
        
        for(int i = 3; i*i<= n ; i=i+2)
        {
            if(n%i == 0)
                    return false;
        }
        
        return true;
    }

}
