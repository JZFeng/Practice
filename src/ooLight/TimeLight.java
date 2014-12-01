package ooLight;

public class TimeLight extends Light
{
    protected boolean isOn = false;

    long LightOnTimestamp;

    @Override
    public void swithOn()
    {
        isOn = true;
        LightOnTimestamp = System.currentTimeMillis();
        System.out.println("Time Light On at " + LightOnTimestamp);
    }

    @Override
    public void switchOff()
    {

        synchronized (this)
        {
            try
            {
                this.wait(5000 - (System.currentTimeMillis() - LightOnTimestamp));
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        System.out.println("Time Light off after 5 seconds.");

    }

}
