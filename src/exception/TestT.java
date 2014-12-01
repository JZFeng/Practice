package exception;

public class TestT
{
    public static void a() throws Exception
    { // 抛出异常给上级处理
        try
        {
            b();
        }
        catch (Exception e)
        {
            throw new Exception(e);
        }
    }

    public static void b() throws Exception
    { // 抛出异常给上级处理
        try
        {
            c();
        }
        catch (Exception e)
        {
            throw new Exception(e);
        }
    }

    public static void c() throws Exception
    { // 抛出异常给上级处理
        try
        {
            throw new NullPointerException("c 异常链中的空指针异常..");
        }
        catch (NullPointerException e)
        {
            throw new Exception(e);
        }
    }

    public static void main(String[] args)
    {
        try
        {
            a();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}