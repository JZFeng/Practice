package designPattern.factory;

public class Factory
{
    public static void main(String[] args) throws Exception
    {
        if(args.length!=1)
        {
            System.out.println("Please enter one car name.");
            System.exit(1);
        }
        
     // 利用反射得到汽车类型
        ICar c  = (ICar) Class.forName("factory." + args[0]).newInstance();
        
        if (c != null)
        {
            c.run();
            c.stop();
        }
        else
        {
            System.out.println("造不了这种汽车。。。");
        }

    }

}
