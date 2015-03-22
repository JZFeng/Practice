package concurrent;

import java.util.Random;

/**
 * 
 * It will show you a sample for incorrect impl of wait-notify
 * 
 *@author jzhfeng@telenav.com
 */
public class WifeAndHusband
{
    static Object husband = new Object(); //this is the lock

    public static void main(String[] args)
    {
        System.out.println("Husband is going fish.");

        Wife wife = new Wife();
        wife.start();

        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e1)
        {
            e1.printStackTrace();
        }

        try
        {

            Random random = new Random();

            int totalWeight = random.nextInt(100);
            int totalFish = random.nextInt(3);

            int averageWeight = totalWeight / totalFish;

            synchronized (husband)
            {
                System.out.println("AverageWeight = " + averageWeight);
                husband.notify();
            }
        }
        catch (Exception e)
        {
            System.out.println("Husband did not notify wife. It makes wife waiting forever.");
        }

        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }

    static class Wife extends Thread
    {
        public void run()
        {
            synchronized (husband)
            {
                try
                {
                    System.out.println("Wife is waiting for husband.");
                    husband.wait();
                    System.out.println("Wife get the message that husband is safe.");
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}