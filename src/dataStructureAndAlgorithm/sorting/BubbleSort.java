package dataStructureAndAlgorithm.sorting;

public class BubbleSort
{

    public static int[] sort(int[] source)
    {
        
        if(source == null || source.length == 0  )
        {
            System.out.println("Unable to Sort Invalid Array");
            return null;
        }
        
       int i, j , tmp;
       for(i = 0; i < source.length; i++)
       {
           for(j = 0 ; j < source.length - 1 - i ; j++)
           {
               if(source[j] > source[j+1])
               {
                   tmp = source[j+1];
                   source[j+1] = source[j];
                   source[j] = tmp;
               }
                     
           }
       }
        
        
        
        return source;
        

        
    }

}
