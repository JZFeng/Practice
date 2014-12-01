package designPattern.decorator.coffee;

public class Sugar extends CoffeeDecorator
{

    public Sugar(ICoffee coffee)
    {
        super(coffee);
    }

    public double getCost()
    {
        return super.getCost() + 0.3;
    }

    @Override
    public String getIngredients()
    {
        return coffee.getIngredients() + "Sugar ";
    }

}
