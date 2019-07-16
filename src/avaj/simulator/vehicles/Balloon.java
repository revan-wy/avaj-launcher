package avaj.simulator.vehicles;

import avaj.simulator.*;
import avaj.weather.*;

public class Balloon extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    Balloon(String name, Coordinates coordinates) {
        super(name, coordinates);
        this.type = "Balloon";
        sunMessage = "That's a hot ball of gas.";
        fogMessage = "Sorry, folks. No more panoramas.";
        rainMessage = "The rain is running into the burner!";
        snowMessage = "Increased mass = decreased bouyancy. That is all.";
    }

    public void updateConditions() {
        String weather = this.weatherTower.getWeather(this.coordinates);
        this.weatherMessage(weather);
        switch(weather) {
            case "sun":
                this.updateInSun();
                break;
            case "fog":
                this.updateInFog();
                break;
            case "rain":
                this.updateInRain();
                break;
            case "snow":
                this.updateInSnow();
                break;
            default:
                this.updateInSun();
                break;
        }
        if (this.coordinates.getHeight() < 1)
            this.land();
	}

    void updateInSun() {
        this.coordinates = Coordinates.coordinateMaker(
            this.coordinates.getLongitude() + 2,
            this.coordinates.getLatitude(),
            this.coordinates.getHeight() + 4
        );
    }
    
    void updateInFog() {
        this.coordinates = Coordinates.coordinateMaker(
            this.coordinates.getLongitude(),
            this.coordinates.getLatitude(),
            this.coordinates.getHeight() - 3
        );
    }
    
    void updateInRain() {
        this.coordinates = Coordinates.coordinateMaker(
            this.coordinates.getLongitude(),
            this.coordinates.getLatitude(),
            this.coordinates.getHeight() - 5
        );
    }
    
    void updateInSnow() {
        this.coordinates = Coordinates.coordinateMaker(
            this.coordinates.getLongitude(),
            this.coordinates.getLatitude(),
            this.coordinates.getHeight() - 15
        );
    }

    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);
        String string = new String("Tower says: " + this.type + "#" + this.name + "(" + this.id + ") registered to weather tower.\n");
        DoTheWriting.writeTheThing(string);
        // System.out.println("Tower says: " + this.type + "#" + this.name + "(" + this.id + ") registered to weather tower.");
    }
    
    void land() {
        String string = new String(this.type + "#" + this.name + "(" + this.id + "): " + "Landing at " + this.coordinates.getLatitude() + "N, " + this.coordinates.getLongitude() + "E.\n");
        DoTheWriting.writeTheThing(string);
        // System.out.println(this.type + "#" + this.name + "(" + this.id + "): " + "Landing at " + this.coordinates.getLatitude() + "N, " + this.coordinates.getLongitude() + "E."); // Baloon#B1(1): Let
        weatherTower.toRemove.add(this);
    }

}