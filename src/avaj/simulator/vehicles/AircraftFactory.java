package avaj.simulator.vehicles;

import avaj.weather.Coordinates;

public class AircraftFactory {
    public static Flyable newAircraft(
        String type,
        String name,
        int longitude,
        int latitude,
        int height) {
            Coordinates coordinates = Coordinates.coordinateMaker(longitude, latitude, height);
            switch(type) {
                case "Helicopter":
                    Flyable newFlyable = new Helicopter(name, coordinates);
                    break;
                case "JetPlane":
                    Flyable newFlyable = new jetPlane(name, coordinates);
                    break;
                case "Balloon":
                    Flyable newFlyable = new Balloon(name, coordinates);
                    break;
                default:
                    System.out.println("\'" + type + "\'' is not a valid type.");
            }
    }
}