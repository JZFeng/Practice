package designPattern.decorator.general;

public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void doSomething()
	{
		super.doSomething();
		System.out.println("Function B");
	}


}
