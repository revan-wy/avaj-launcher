package avaj.weather;

public class WeatherProvider {
    private static WeatherProvider weatherProvider;
    private static String[] weather;

    private WeatherProvider() {

    }

    public static WeatherProvider getProvider() {
        return new WeatherProvider();
    }

    public String getCurrentWeather(Coordinates coordinates) {
        int mod = coordinates.getSum() % 4;
        switch(mod) {
            case 0:
                return "sun";
            case 1:
                return "rain";
            case 2:
                return "fog";
            case 3:
                return "snow";
            default:
                return "sun";
        }
    }

}