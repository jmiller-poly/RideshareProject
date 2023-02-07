/*
 * Road.java
 * @authors: Nick Gomez, James Miller
 * @version: 2/2/23
 */

import java.util.*;

public class Road {
    //fields//
    private ArrayList<Station> stations;
    private ArrayList<Car> cars;
    private int totalRevenue;
    private int stationNum; //The identifying number of the next station
    
    //constructors//
    public Road() {
        stations = new ArrayList<Station>();
        cars = new ArrayList<Car>();
        totalRevenue = 0;
        stationNum = 0;
    }

    /**
     * adds a new station on the route
     */
    //methods// 
    public void addStation() {
        stations.add(new Station(stationNum));
        stationNum++;
    }

    /**
     * adds a car
     * @param firstStation
     * @param lastDestination
     * @param goingForward
     */
    public void addCar(int firstStation, int lastDestination) {
        cars.add(new Car(firstStation, lastDestination));
        System.out.println("New Car first station: " + cars.get(cars.size() - 1).getCurrentStop());
    }

    /**
     * adds a passenger
     * @param startingPoint
     * @param finalDestination
     */
    public void addPassenger(int startingPoint, int finalDestination) {
        stations.get(startingPoint).addPassenger(new Passenger(finalDestination));
    }

    /**
     * calls the selected car to "move" stations
     */
    public void advance() {
        for(int i = 0; i < cars.size(); i++) {
            Car c = cars.get(i);
            if(c.getLastStop() == c.getCurrentStop()) {
                totalRevenue += c.getRevenue();
                cars.remove(c);
                i--;
            } else {
            c.move(stations);
            }
        }
    }

    public String toString() {
        return "Road[" +
        "\nStations=[" + stations +
        "]\nCars=[" + cars +
        "\nTotal Revenue=" + totalRevenue +
        "]]"; 
    }

}
