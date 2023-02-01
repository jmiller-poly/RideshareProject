import java.util.*;

public class Car {
    //fields//
    private int currentStation;
    private boolean goingForward;
    private ArrayList<Passenger> passengers;
    private int revenue;

    //constructors//
    public Car(int firstStation, boolean startForward) {
        currentStation = firstStation;
        goingForward = startForward; 
        passengers = new ArrayList<Passenger>();
    }

    public Car(int firstStation) {
        currentStation = firstStation;
        goingForward = true;
        passengers = new ArrayList<Passenger>();
    }

    public Car() {
        currentStation = 0;
        goingForward = true;
        passengers = new ArrayList<Passenger>();
    }

    //methods//
    
    public void dropOff(Station station) {
        for(int i = 0; i < 3; i++) {
            Passenger currPass = passengers.get(i);
            if(currPass.getDest() == currentStation) {
                station.receive(passengers.get(i)); 
                passengers.remove(i);
            }
        }
    }

    public void pickUp(Station station) {
        for(int i = passengers.size(); i < 3; i++) {
            if(station.getPassCount() > 0) {
                passengers.add(station.load());
            }
        }
    }

    public void go(int lastStop) {
        if(currentStation == 0) {
            goingForward = true;
        } else if(currentStation == lastStop) {
            goingForward = false;
        }
        if(goingForward == true) {
            currentStation ++;
        } else {
            currentStation --; 
        }
        revenue += passengers.size();
    }

    public String toString() {
        return super.toString() + 
        "Car" +
        "[CurrentStop=" + currentStation +
        ",Passengers=" + passengers +
        ",CurrentRevenue" + revenue; 
    }
}
