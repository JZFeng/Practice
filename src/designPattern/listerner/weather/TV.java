package designPattern.listerner.weather;

public class TV implements IWeatherListener {

	public void updateWeather(int areaCode, long temperature) {
		System.out.println("TV Update:"+"[Area Code:"+areaCode+", Temperature:"+temperature+"]");
	}

}
