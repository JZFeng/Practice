package concurrent;

public class DeadLock
{
    static DeadLock instance = new DeadLock();

    private Object lock1 = new Object();

    private Object lock2 = new Object();

    public void function1()
    {
        synchronized (lock1)
        {
            System.out.println("We get lock1 in thread=" + Thread.currentThread());
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
            }
            System.out.println("Trying to get lock2 in thread=" + Thread.currentThread());
            synchronized (lock2)
            {
                System.out.println("We get lock2 in thread=" + Thread.currentThread());
            }
        }
    }

    public void function2()
    {
        synchronized (lock2)
        {
            System.out.println("We get lock2 in thread=" + Thread.currentThread());
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
            }
            System.out.println("Trying to get lock1 in thread=" + Thread.currentThread());
            synchronized (lock1)
            {
                System.out.println("We get lock1 in thread=" + Thread.currentThread());
            }
        }
    }

    public static void main(String[] args)
    {

        Thread t1 = new Thread()
        {
            public void run()
            {
                instance.function1();
            }
        };

        t1.start();

        instance.function2();

    }

}