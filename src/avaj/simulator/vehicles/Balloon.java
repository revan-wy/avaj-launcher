package avaj.simulator.vehicles;

import avaj.simulator.*;
import avaj.weather.*;

public class Balloon extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    String type = "Balloon";

    Balloon(String name, Coordinates coordinates) {
        super(name, coordinates);

    }

    public void updateConditions() {
		
	}

    public void registerTower(WeatherTower weatherTower) {
		        System.out.println("Tower says: " + this.type + "#" + this.name + "(" + this.getIdCounter() + ") registered to weather tower.");
	}
}