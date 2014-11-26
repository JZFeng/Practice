package designPattern.decorator.general;

public class Decorator implements Component {
	
	Component component;

	public Decorator(Component component) {
		// TODO Auto-generated constructor stub
		this.component=component;
		
	}

	@Override
	public void doSomething() {

		component.doSomething();
		
	}
	
	
	

}
