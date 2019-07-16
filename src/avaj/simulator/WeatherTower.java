package avaj.simulator;

import avaj.simulator.vehicles.Flyable;
import avaj.weather.Coordinates;
import avaj.weather.WeatherProvider;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates) {
        WeatherProvider weatherProvider = WeatherProvider.getProvider();
        return weatherProvider.getCurrentWeather(coordinates);
    }

    void changeWeather() {
        for (Flyable flyable: this.getObservers()) {
            flyable.updateConditions();
        }
        removeAircraft();
    }
}