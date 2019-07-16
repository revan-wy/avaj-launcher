package avaj.simulator.vehicles;

import avaj.simulator.DoTheWriting;
import avaj.simulator.WeatherTower;
import avaj.weather.*;

public class JetPlane extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    
    JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
        this.type = "JetPlane";
        sunMessage = "Fast.";
        fogMessage = "Slow.";
        rainMessage = "Wet";
        snowMessage = "Cold.";
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
            this.coordinates.getLongitude(),
            this.coordinates.getLatitude() + 1,
            this.coordinates.getHeight()
        );
    }
    
    void updateInRain() {
        this.coordinates = Coordinates.coordinateMaker(
            this.coordinates.getLongitude(),
            this.coordinates.getLatitude() + 5,
            this.coordinates.getHeight()
        );
    }
    
    void updateInSnow() {
        this.coordinates = Coordinates.coordinateMaker(
            this.coordinates.getLongitude(),
            this.coordinates.getLatitude(),
            this.coordinates.getHeight() - 7
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