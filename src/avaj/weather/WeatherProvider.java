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
                // break;
            case 1:
                return "rain";
                // break;
            case 2:
                return "fog";
                // break;
            case 3:
                return "snow";
                // break;
            default:
                return "sun";
        }
    }

}