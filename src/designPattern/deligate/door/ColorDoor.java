package designPattern.deligate.door;

public class ColorDoor extends Door {
	
	int color;

	@Override
	public void open() {
		System.out.println("Color Door Open.");

	}

	@Override
	public void close() {
		System.out.println("Color Door Close.");
	}

}
