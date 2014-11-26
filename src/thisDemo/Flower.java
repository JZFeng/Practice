package thisDemo;

public class Flower
{ 
    int petalCount = 0;
    String name = "Initial Name";


    public Flower(int petalCount)
    {
        this.petalCount = petalCount;
        System.out.println("constructor with int arg only.");
    }
    
    public Flower(String name)
    {
        this.name = name;
        System.out.println("constructor with String arg only.");
    }
    
    public Flower(int petalCount, String name)
    {
        this(petalCount);
        this.name = name;
        System.out.println("constructor with two arguments.");
    }
    
    public Flower()
    {
        this(47, "Hi");
        System.out.println("Default constructor.");
    }

}
