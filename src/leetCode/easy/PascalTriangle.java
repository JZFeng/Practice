package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle
{

    public static void main(String[] args)
    {

        List<List<Integer>> result = generate(5);

    }

    public static List<List<Integer>> generate(int numRows)
    {

        List<Integer> list = new ArrayList<Integer>(); 
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0)
        {
            return result;
        }
        list.add(1);
        result.add(list);
        List<Integer> subResult;
        for (int i = 2; i <= numRows; i++)
        {
            list = new ArrayList<Integer>(); //temporary variable
            subResult = result.get(i - 2); // get the first 
            
            list.add(1);
            for (int j = 1; j < subResult.size(); j++)
            {
                list.add(subResult.get(j - 1) + subResult.get(j));
            }
            list.add(1);
            
            result.add(list);
        }

        return result;
    }

}