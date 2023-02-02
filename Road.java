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
    
    //constructors//
    public Road() {
        ArrayList<Station> stations = new ArrayList<Station>();
        ArrayList<Car> cars = new ArrayList<Car>();
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
        for(Car c : cars) {
            if(c.getLastStop() == c.getCurrentStop()) {
                ;
            }
            c.move(stations);
        }
    }

}
