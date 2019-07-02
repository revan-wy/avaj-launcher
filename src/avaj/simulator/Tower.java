package avaj.simulator;

import java.util.ArrayList;
import java.util.List;

import avaj.simulator.vehicles.Flyable;

public class Tower {
    private List<Flyable> observers = new ArrayList<Flyable>();

    public void register(Flyable flyable) {

    }

    public void unregister(Flyable flyable) {

    }

    protected void conditionsChanged() {
        
    }
}