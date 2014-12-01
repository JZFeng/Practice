package ooLight;
import java.util.Iterator;
import java.util.Vector;

public class Entry
{

    public static void main(String[] args)
    {
        Vector LightList = new Vector();
        
        LightList.addElement(new ColorLight());
        LightList.addElement(new TimeLight());
        
        int size = LightList.size();
        for (int i = 0; i < size; i++)
        {
            Light light = (Light)LightList.elementAt(i);
            light.swithOn();
            light.switchOff();
            
        }
        

    }

}
