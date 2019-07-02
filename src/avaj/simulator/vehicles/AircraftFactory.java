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
            Flyable newFlyable;
            switch(type) {
                case "Helicopter":
                    newFlyable = new Helicopter(name, coordinates);
                    break;
                case "JetPlane":
                    newFlyable = new JetPlane(name, coordinates);
                    break;
                case "Balloon":
                    newFlyable = new Balloon(name, coordinates);
                    break;
                default:
                    System.out.println("\'" + type + "\'' is not a valid type.");
            }
    }
}