package designPattern.decorator.general;

public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void doSomething()
	{
		super.doSomething();
		System.out.println("Function A");
	}

}
