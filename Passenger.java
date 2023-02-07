/*
 * Passenger.java
 * @authors: James Miller, Nick Gomez
 * @version: 2/2/23
 */

public class Passenger {
    //fields//
    private int destination;

    //constructors//
    public Passenger(int myDestination) { 
        destination = myDestination; 
    }

    //methods
    /**
     * 
     * @return destination variable
     */
    public int getDest() {
        return destination;  
    }

    public String toString() { 
        return super.toString() +
        "Passenger" +
        "[dest=" + destination +
        "]"; 
    }
}