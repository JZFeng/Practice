package designPattern.decorator.general;

public class DecortorTest {

	public DecortorTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new ConcreteDecorator2(new ConcreteDecorator1(new ConcreteComponent()))).doSomething();

	}

}
