package designPattern.deligate.door;

//实现了Runnable接口，这样LightDoor就具备了多线程的功能了。这个线程用来显示门上的灯。
public class LightDoor extends Door implements Runnable
{

    public LightDoor()
    {
    }

    @Override
    public void open()
    {
        System.out.println("Light Door Open.");
        
    }

    @Override
    public void close()
    {
        System.out.println("Light Door close.");        
    }

    @Override
    public void run()
    {
        boolean isX = false;
        
        while (true)
        {
            if (isX)
            {
                System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
            }
            else
            {
                System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZ");
            }
           
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            
            isX=true;
        }
        
    }
    
    

}
