package designPattern.factory;

class Ford implements ICar
{
    public void run()
    {
        System.out.println("Ford开始启动了。。。");
    }

    public void stop()
    {
        System.out.println("Ford停车了。。。。");
    }
}