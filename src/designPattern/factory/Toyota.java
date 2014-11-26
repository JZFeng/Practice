package designPattern.factory;

class Toyota implements ICar
{
    public void run()
    {
        System.out.println("Toyota开始启动了。。。");
    }

    public void stop()
    {
        System.out.println("Toyota停车了。。。。");
    }
}