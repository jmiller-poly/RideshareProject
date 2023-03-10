/*
 * Road.java
 * @authors: Nick Gomez, James Miller
 * @version: 2/9/23
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

    /*
     * returns totalRevenue
     */
    public int getTotalRevenue() {
        return totalRevenue;
    }

    /*
     * return the number of passangers left after dropoffs
     */
    public int getLeftOverPassengers() {
        int sum = 0;
        for(Station s : stations) {
            sum += s.getPassCount();
        }
        return sum;
    }

    /*
     * getter method to return if there are any cars on the road
     */
    public int getCarsOnRoad() {
        return cars.size();
    }
    /**
     * returns the toString of the car, informative
     */
    public String toString() {
        return "\nRoad[" +
        "\nStations=[" + stations +
        "]\nCars=[" + cars +
        "]\nTotal Revenue=" + totalRevenue +
        "]]"; 
    }

}
