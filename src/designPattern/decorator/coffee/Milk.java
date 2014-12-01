package designPattern.decorator.coffee;

public class Milk extends CoffeeDecorator
{

    public Milk(ICoffee coffee)
    {
        super(coffee);
    }

    public double getCost()
    {
        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients()
    {
        return coffee.getIngredients() + "Milk ";
    }

}
