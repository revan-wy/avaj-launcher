package avaj.simulator.vehicles;

import avaj.simulator.*;
import avaj.weather.Coordinates;

public interface Flyable {
    public void updateConditions();
    public void registerTower(WeatherTower weatherTower);
    public Coordinates getCoordinates();
}