/*
 * Passenger.java
 * @authors: James Miller, Nick Gomez
 * @version: 2/7/23
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
    /**
     * returns the toString of the car, informative
     */
    public String toString() { 
        return "\n\t\t\t" + super.toString() +
        "Passenger" +
        "[Dest=" + destination +
        "]"; 
    }
}