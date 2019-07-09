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
        String weather = weatherTower.getWeather(this.coordinates);
        switch(weather) {
            print message;
            update coordinates;
        }
        if height > 100 {
            height = 100;
        } else if height < 1 {
            land aircraft;
        }
        
	}

    public void registerTower(WeatherTower weatherTower) {
        weatherTower.register(this);
        System.out.println("Tower says: " + this.type + "#" + this.name + "(" + this.id + ") registered to weather tower.");
	}
}