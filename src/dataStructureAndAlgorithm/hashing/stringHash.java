package dataStructureAndAlgorithm.hashing;

public class stringHash
{

    public static void main(String[] args)
    {
        String s = "Hello";
        System.out.println(s.hashCode());
        System.out.println(hashCode(s));
        

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

}
