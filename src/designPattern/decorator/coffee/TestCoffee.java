package designPattern.decorator.coffee;

public class TestCoffee
{

    public static void main(String[] args)
    {
        String Ingredients = (new Sugar((new Milk(new SimpleCoffee())))).getIngredients();
        double Cost = (new Sugar((new Milk(new SimpleCoffee())))).getCost();
        System.out.println("Ingredients: " + Ingredients + "; Cost: " + Cost);

    }

}
