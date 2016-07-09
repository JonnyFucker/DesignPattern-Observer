/**
 * Created by tomek on 26.01.16.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 60, 30.4f);
        weatherData.setMeasurements(20, 40, 12.5f);

        weatherData.removeObserver(forecastDisplay);

        weatherData.setMeasurements(30, 40, 50);
    }
}
