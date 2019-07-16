package avaj.simulator.vehicles;

import avaj.simulator.DoTheWriting;
import avaj.simulator.WeatherTower;

import avaj.weather.*;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    
    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
        this.type = "Helicopter";
        sunMessage = "Time to get some air.";
        fogMessage = "Manoeuvre out of this fog bank.";
        rainMessage = "Chop the water!";
        snowMessage = "Snowcones!";
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
            this.coordinates.getLongitude() + 10,
            this.coordinates.getLatitude(),
            this.coordinates.getHeight() + 2
        );
    }
    
    void updateInFog() {
        this.coordinates = Coordinates.coordinateMaker(
            this.coordinates.getLongitude() + 1,
            this.coordinates.getLatitude(),
            this.coordinates.getHeight()
        );
    }
    
    void updateInRain() {
        this.coordinates = Coordinates.coordinateMaker(
            this.coordinates.getLongitude() + 5,
            this.coordinates.getLatitude(),
            this.coordinates.getHeight()
        );
    }
    
    void updateInSnow() {
        this.coordinates = Coordinates.coordinateMaker(
            this.coordinates.getLongitude(),
            this.coordinates.getLatitude(),
            this.coordinates.getHeight() - 12
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