package avaj.simulator;

import java.util.ArrayList;
import java.util.List;

// import avaj.simulator.vehicles.Aircraft;
// import avaj.simulator.vehicles.Balloon;
// import avaj.simulator.vehicles.JetPlane;
// import avaj.simulator.vehicles.Helicopter;
import avaj.simulator.vehicles.Flyable;

public class Tower {
    private List<Flyable> observers = new ArrayList<Flyable>();
    public List<Flyable> toRemove = new ArrayList<Flyable>();

    public void register(Flyable flyable) {
        observers.add(flyable);
        // System.out.println(flyable.getClass());
        // System.out.println("Tower says: " + flyable.type + "#" + flyable.name + "(" + flyable.id + ") registered to weather tower.");
        // Tower says: Baloon#B1(1) registered to weather tower.
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