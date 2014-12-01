package designPattern.decorator.coffee;

public class CoffeeDecorator implements ICoffee
{

    ICoffee coffee;

    public CoffeeDecorator(ICoffee coffee)
    {
        this.coffee = coffee;
    }

    @Override
    public double getCost()
    {
        return coffee.getCost();
    }

    @Override
    public String getIngredients()
    {
        return coffee.getIngredients();
    }

}
