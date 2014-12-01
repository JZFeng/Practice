package concurrent.sync;

public class Deligate
{
    Object lock = new Object();

    public void function()
    {

//        synchronized (lock)
//        {

            // part 1 ...
            System.out.println("part 1 is done.");

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            // part 2 ...
            System.out.println("part 2 is done.");

            // part 3 ...
            System.out.println("part 3 is done.");

//        }

        // part 4 ...
        System.out.println("part 4 is done.");

        // part 5 ...
        System.out.println("part 5 is done.");

        // part 6 ...
        System.out.println("part 6 is done.");

    }

}
