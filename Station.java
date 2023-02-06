/*
 * Station.java
 * @authors: Nick Gomez, James Miller
 * @version: 2/2/23
 */

import java.util.*;

public class Station {
    //fields//
    private int stationNum;
    private ArrayList<Passenger> passengers;
    private ArrayList<Passenger> successes; 

    //constructors//
    public Station(int whatStation) {
        stationNum = whatStation;
        passengers = new ArrayList<Passenger>();
        successes = new ArrayList<Passenger>(); 
    }

    //methods//
    public void addPassenger(Passenger newPassenger) {
        passengers.add(newPassenger);
    }

    public void receive(Passenger p) {
        if(p.getDest() == stationNum) {
            successes.add(p);
        } else {
            passengers.add(p)
        }
    }

    public Passenger load() {
        return passengers.get(0);
    }

    public int getPassCount() {
        return passengers.size();
    }

    public String toString() {
        return "";
    }
    
}
