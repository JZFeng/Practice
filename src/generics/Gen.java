package generics;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//类型参数
public class Gen<T extends Number & Serializable>
{
    private T obj;

    Gen(T obj)
    {
        this.obj = obj;
    }

    public T getObj()
    {
        return this.obj;
    }

    public void setObj(T obj)
    {
        this.obj = obj;
    }

    public void showType()
    {
        System.out.println(obj.getClass().getName());
    }
    

    public static void main(String[] args)
    {
        Gen<Integer> g1 = null;

        
    }

}
