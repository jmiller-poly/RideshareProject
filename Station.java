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
    /**
     * adds new passenger
     * @param newPassenger
     */
    public void addPassenger(Passenger newPassenger) {
        passengers.add(newPassenger);
    }

    /**
     * returns whether to drop off, either added to list of waiting, or sucessfully dropped off
     * @param p
     */
    public void receive(Passenger p) { 
        if(p.getDest() == stationNum) {
            successes.add(p);
        } else {
            passengers.add(p);
        }
    }

    /**
     * returns the first passenger in the array list
     * @return
     */
    public Passenger load() { 
        return passengers.get(0);
    }

    /**
     * returns number of passengers in the array list
     * @return
     */
    public int getPassCount() { 
        return passengers.size();
    }

    public String toString() {
        return "";
    }
    
}
