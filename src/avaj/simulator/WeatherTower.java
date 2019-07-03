package avaj.simulator;

import avaj.weather.Coordinates;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates) {
        Random rand = new Random();
        int value = rand.nextInt(4) + 1;
        switch(value) {
            case 1: //sun
                return "SUN";
                break;
            case 2: //rain
                return "RAIN";
                break;
            case 3: //fog
                return "FOG";
                break;
            case 4: //snow
                return "SNOW";
                break;
            // default:
            //     return "SUN";
        }
    }

    void changeWeather() {

    }
}