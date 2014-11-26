package designPattern.decorator.coffee;

public class SimpleCoffee implements ICoffee
{

    public SimpleCoffee()
    {
    }

    @Override
    public double getCost()
    {
        return 1;
    }

    @Override
    public String getIngredients()
    {
        return "Simple Coffee ";
    }

}
