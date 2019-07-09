package avaj.weather;

import java.util.Random;

public class WeatherProvider {
    private static WeatherProvider weatherProvider;
    private static String[] weather;

    private WeatherProvider() {

    }

    public static WeatherProvider getProvider() {
        return new WeatherProvider();
    }

    public String getCurrentWeather(Coordinates coordinates) {
        Random rand = new Random();
        int value = rand.nextInt(4);
        switch(value) {
            case 0:
                return "SUN";
                // break;
            case 1:
                return "RAIN";
                // break;
            case 2:
                return "FOG";
                // break;
            case 3:
                return "SNOW";
                // break;
            default:
                return "SUN";
        }
    }
}