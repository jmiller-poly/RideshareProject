/*
 * Car.java
 * @authors: Nick Gomez, James Miller
 * @version: 2/2/23
 */

import java.util.*;

public class Car {
   //fields//
   private int currentStation; //current station
   private boolean goingForward; //boolean variable that if true, moves the current station forward
   private ArrayList<Passenger> passengers; //array list of passengers
   private int revenue; //amount of money for driver made
   private int finalDestination; //end of program when car reaches end

   //constructors//
    public Car(int firstStation, int lastDestination) {
       currentStation = firstStation;
       goingForward = firstStation < lastDestination; 
       finalDestination = lastDestination;
       passengers = new ArrayList<Passenger>();
    }

    public Car(int firstStation) {
       currentStation = firstStation;
       finalDestination = currentStation + 1;
       goingForward = true;
       passengers = new ArrayList<Passenger>();
    }


    //methods
    /**
     * ends rideshare, does not restart when final destination is reached
     * @return the final destination of the carr
     * 
     */
    public int getLastStop() { 
        return finalDestination;
    }
    /**
     * 
     * @return current location
     */
    public int getCurrentStop() { 
        return currentStation;
    }
    /**
     * Removes a passenger from array list after dropoff
     * @param station 
     *
     */
    private void dropOff(Station station) {
        if(passengers.size() > 0) {
            for(int i = 0; i < passengers.size(); i++) {
                Passenger currPass = passengers.get(i);
                if(currPass.getDest() == currentStation) {
                    station.receive(passengers.get(i)); 
                    passengers.remove(i);
                }
            }
        }
    }

   /**
    * adds to list/picks up a passenger
    * @param station
    */
    private void pickUp(Station station) { 
        for(int i = passengers.size(); i < 3; i++) {
            if(goingForward == true) {
                if(station.hasForwardPassenger()) {
                    passengers.add(station.load(goingForward));
                }
            } else {
                if(station.hasBackwardPassenger()) {
                    passengers.add(station.load(goingForward));
                }
            }
        }
    }
    /**
     * if the car is going forward, add 1 to current location, if not, go back 1
     */
    private void go() {
        if(goingForward == true) {
            currentStation ++;
        } else {
            currentStation --; 
        }
        revenue += passengers.size();
    }

   /**
    * calls go, dropOff, pickUp methods
    * @param stations
    */
    public void move(ArrayList<Station> stations) {
        pickUp(stations.get(currentStation));
        go();
        dropOff(stations.get(currentStation));
    }
    

    /**
     * 
     * @return the revenue of the car
     */
    public int getRevenue() { 
        return revenue;
    }

    public String toString() {
        return "\n\t" + super.toString() + 
        "Car" +
        "[CurrentStop=" + currentStation +
        ",Passengers=" + passengers +
        ",CurrentRevenue" + revenue
        + "]"; 
    }
}
