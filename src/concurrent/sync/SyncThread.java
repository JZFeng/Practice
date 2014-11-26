package concurrent.sync;

public class SyncThread extends Thread
{
    long startTimeStamp = System.currentTimeMillis();
    Deligate deligate = null;
    
    
    public SyncThread(Deligate deligate)
    {
        this.deligate = deligate;
    }
    
    public void run()
    {
        int i =0;
        while(true)
        {
            deligate.function();
            i++;
            if(i>20)
            {
                break;
            }
        }
       
        
    }

}
