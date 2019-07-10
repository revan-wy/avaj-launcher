package avaj.simulator;

import avaj.weather.Coordinates;
import avaj.weather.WeatherProvider;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates) {
        WeatherProvider weatherProvider = WeatherProvider.getProvider();
        return weatherProvider.getCurrentWeather(coordinates);
        // Random rand = new Random();
        // int value = rand.nextInt(4);
        // switch(value) {
        //     case 0:
        //         return "SUN";
        //         // break;
        //     case 1:
        //         return "RAIN";
        //         // break;
        //     case 2:
        //         return "FOG";
        //         // break;
        //     case 3:
        //         return "SNOW";
        //         // break;
        //     default:
        //         return "SUN";
        // }
    }

    void changeWeather() {

    }
}