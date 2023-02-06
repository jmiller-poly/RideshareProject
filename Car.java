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
   public Car(int firstStation, int lastDestination, boolean startForward) {
       currentStation = firstStation;
       goingForward = startForward; 
       finalDestination = lastDestination;
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
    public int getLastStop() { //ends rideshare, does not restart when final destination is reached
        return finalDestination;
    }

    public int getCurrentStop() { //calls current location
        return currentStation;
    }
    
    private void dropOff(Station station) { //removes a passenger
        for(int i = 0; i < 3; i++) {
            Passenger currPass = passengers.get(i);
            if(currPass.getDest() == currentStation) {
                station.receive(passengers.get(i)); 
                passengers.remove(i);
            }
        }
    }

    private void pickUp(Station station) { //adds/picks up a passenger
        for(int i = passengers.size(); i < 3; i++) {
            if(station.getPassCount() > 0) {
                passengers.add(station.load());
            }
        }
    }

    private void go() {
        if(goingForward == true) {
            currentStation ++;
        } else {
            currentStation --; 
        }
        revenue += passengers.size();
    }

    public void move(ArrayList<Station> stations) {
        go();
        dropOff(stations.get(currentStation));
        if(goingForward == true) {
            if(stations.get(currentStation).hasForwardPassenger()) {
                pickUp(stations.get(currentStation));
            }
        } else {
            if(stations.get(currentStation).hasBackwardPassenger()) {
                pickUp(stations.get(currentStation));
            }
        }
    }

    public int getRevenue() {
        return revenue;
    }

    public String toString() {
        return super.toString() + 
        "Car" +
        "[CurrentStop=" + currentStation +
        ",Passengers=" + passengers +
        ",CurrentRevenue" + revenue; 
    }
}
