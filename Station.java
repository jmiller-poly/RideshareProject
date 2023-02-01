import java.util.*;

public class Station {
    //fields//
    private ArrayList<Passenger> passengers;
    private ArrayList<Passenger> successes; 

    //constructors//
    public Station() {
        passengers = new ArrayList<Passenger>(); 
    }

    //methods//
    public void addPassenger(Passenger newPassenger) {
        passengers.add(newPassenger);
    }

    public void recieve(Passenger p) {
        successes.add(p);
    }

    public Passenger load() {
        return passengers.get(0);
    }

    public int getPassCount() {
        return passengers.size();
    }

    
}
