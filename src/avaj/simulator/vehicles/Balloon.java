package avaj.simulator.vehicles;

import avaj.simulator.*;
import avaj.weather.*;

public class Balloon extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    Balloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {
		
	}

    public void registerTower(WeatherTower weatherTower) {
		
	}
}