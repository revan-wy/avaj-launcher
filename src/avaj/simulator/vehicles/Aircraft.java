package avaj.simulator.vehicles;

import avaj.simulator.DoTheWriting;
import avaj.weather.*;

public class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter = 1;
    String type;
    String sunMessage;
    String fogMessage;
    String rainMessage;
    String snowMessage;

    protected Aircraft(String name, Coordinates coordinates) {
        this.name = name;
        this.id = nextId();
        this.coordinates = coordinates;
    }

    private long nextId() {
        return idCounter++;
    }

    public long getIdCounter() {
        return idCounter;
    }

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    void weatherMessage(String weather) {
            String message;
            switch(weather) {
                case "sun":
                    message = sunMessage;
                    break;
                case "fog":
                    message = fogMessage;
                    break;
                case "rain":
                    message = rainMessage;
                    break;
                case "snow":
                    message = snowMessage;
                    break;
                default:
                    message = sunMessage;
                    break;
            }
            String string = new String(this.type + "#" + this.name + "(" + this.id + "): " + message + "\n");
            DoTheWriting.writeTheThing(string);
    }
}