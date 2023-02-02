/*
 * Passenger.java
 * @authors: James Miller, Nick Gomez
 */

public class Passenger {
    //fields//
    private int destination;

    //constructors//
    public Passenger(int myDestination) {
        destination = myDestination; 
    }

    //methods//
    public int getDest() {
        return destination; 
    }

    public String toString() {
        return super.toString() +
        "Passenger" +
        "[dest=" + destination; 
    }
}