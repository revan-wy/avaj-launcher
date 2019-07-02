package avaj.simulator.vehicles;

import avaj.simulator.*;

public interface Flyable {
    public void updateConditions();
    public void registerTower(WeatherTower WeatherTower);
}