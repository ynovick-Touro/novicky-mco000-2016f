
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, IDisplay {

	// Notice it makes no use of pressure
	private double temperature;
	private double humidity;
	
	public CurrentConditionsDisplay(Observable observable)
	{
		observable.addObserver(this);
	}
	
	public void update(Observable observable, Object stateObject)
	{
		if (observable instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData) observable;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	public void display()
	{
		System.out.println("Message from CurrentConditionsDisplay: ***\t" + temperature + " degrees, and " + humidity + " humidity.");
	}
}