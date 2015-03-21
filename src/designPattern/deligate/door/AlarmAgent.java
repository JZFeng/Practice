package designPattern.deligate.door;

public class AlarmAgent implements IAlarm{

	@Override
	public void alarm() {
		System.out.println("Playing Alarm Audio.");
	}
}
