package thisDemo;

public class Person
{
    public void eatApple(Apple apple)
    {
        Apple peeled = Peeler.peel(apple);
        System.out.println("Peeled app, Yummy Yummy!");
    }

}
