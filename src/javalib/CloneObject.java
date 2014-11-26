package javalib;

import java.lang.reflect.Method;

public class CloneObject implements Cloneable
{
    private int height;

    private int weight;
    
    public void setHeight( int h)
    {
        this.height=h;
    }    
    
    public void setWidth(int w)
    {
        this.weight=w;
    }

    public Object clone() throws CloneNotSupportedException
    {
        CloneObject clonedObject = new CloneObject();
        clonedObject.height = this.height;
        clonedObject.weight = this.weight;
        return clonedObject;

    }
    
    
    public static void main(String args[])
    {
        CloneObject test = new CloneObject();
        Class c1 = test.getClass();
        System.out.println(c1);
        System.out.println(c1.getSuperclass());
        Method methods[] = c1.getMethods();
        for (int i = 0; i < methods.length; i++)
        {
            System.out.println(methods[i]);
        }
        
        
    }

}
