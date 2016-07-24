
import java.util.Observable;
import java.util.Observer;

public class PredictionsDisplay implements Observer, IDisplay{

	private double temperature;
	private double humidity;
	private double pressure;
	
	public PredictionsDisplay(Observable observable)
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
			this.pressure = weatherData.getPressure();
			display();
		}
	}
	
	public void display()
	{
		// some special algorithm for predicting the weather
		double score = temperature + (humidity * 100) / pressure;
		if (score > 90)
			System.out.println("Message from PredictionDisplay:\t*** Looks like it will be hot ***");
		else
			System.out.println("Message from PredictionDisplay:\t*** Looks like it will be cold ***");
	}
}