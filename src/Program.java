
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay display1 = new CurrentConditionsDisplay(weatherData);
		PredictionsDisplay display2 = new PredictionsDisplay(weatherData);
		
		weatherData.setMeasurements(66.0,  0.28, 0.9);
		weatherData.setMeasurements(31.0,  0.18, 0.85);
	}

}
