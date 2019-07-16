package avaj.simulator;

import java.util.ArrayList;
import java.util.List;

import avaj.simulator.vehicles.Flyable;

public class Tower {
    private List<Flyable> observers = new ArrayList<Flyable>();
    public List<Flyable> toRemove = new ArrayList<Flyable>();

    public void register(Flyable flyable) {
        observers.add(flyable);
    }

    public void unregister(Flyable flyable) {
        observers.remove(flyable);
    }

    protected void conditionsChanged() {
        
    }

    public List<Flyable> getObservers() {
        return observers;
    }

    void removeAircraft() {
        observers.removeAll(toRemove);
    }
}