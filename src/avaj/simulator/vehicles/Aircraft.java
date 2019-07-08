package avaj.simulator.vehicles;

import avaj.weather.*;

public class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter;

    protected Aircraft(String name, Coordinates coordinates) {
        this.name = name;
    }

    private long nextId() {
        return idCounter++;
    }

    public long getIdCounter() {
        return idCounter;
    }
}