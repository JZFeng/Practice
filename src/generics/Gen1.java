package generics;

public class Gen1
{
    public <T extends String> void f(T x)
    {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args)
    {
        Gen1 ea = new Gen1();
        ea.f(" ");
        ea.f("a");
    }
}