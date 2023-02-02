/*
 * Road.java
 * @authors: Nick Gomez, James Miller
 * @version: 2/2/23
 */

import java.util.*;

public class Road {
    //fields//
    ArrayList<Station> stations;
    ArrayList<Car> cars;
    int totalRevenue;
    
    //constructors//
    public Road() {
        stations = new ArrayList<Station>();
        cars = new ArrayList<Car>();
    }

    //methods//
    public void addStation() {
        stations.add(new Station());
    }

    public void addCar(int firstStation, int lastDestination, boolean goingForward) {
        cars.add(new Car(firstStation, lastDestination, goingForward));
    }

    public void addPassenger(int startingPoint, int finalDestination) {
        stations.get(startingPoint).addPassenger(new Passenger(finalDestination));
    }

    public void advance() {
        for(int i = 0; i < cars.size(); i++) {
            Car c = cars.get(i);
            if(c.getLastStop() == c.getCurrentStop()) {
                totalRevenue += c.getRevenue();
                cars.remove(c);
                i--;
            }
            c.move(stations);
        }
    }

    public String toString() {
        return "Road[" +
        "stations=" + stations+
        ", cars=" + cars +
        "]"; 
    }

}
