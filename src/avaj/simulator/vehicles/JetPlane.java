package avaj.simulator.vehicles;

import avaj.simulator.WeatherTower;
import avaj.weather.*;

public class JetPlane extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    String type = "JetPlane";

    JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {

    }

    public void registerTower(WeatherTower weatherTower) {

    }
}