package avaj.weather;

public class WeatherProvider {
    private static WeatherProvider weatherProvider;
    private static String[] weather;

    private WeatherProvider() {

    }

    public static WeatherProvider getProvider() {
        return new WeatherProvider();
    }

    public String getCurrentWeather(Coordinates coor)
}