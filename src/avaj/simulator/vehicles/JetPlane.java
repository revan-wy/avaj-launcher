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
        weatherTower.register(this);
        System.out.println("Tower says: " + this.type + "#" + this.name + "(" + this.id + ") registered to weather tower.");
	}
}