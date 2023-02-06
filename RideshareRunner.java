/*
 * RideshareRunner.java
 * @authors: Nick Gomez, James Miller
 * @version: 2/2/23
 */

public class RideshareRunner {
    public static void main(String[] args) {
        Road mainSt = new Road();
        for(int i = 0; i < 5; i++) {
            mainSt.addStation();
        }
        mainSt.addCar(0, 2);
        mainSt.addCar(1, 4);
        mainSt.addPassenger(1, 3);
        mainSt.addPassenger(4, 2);
        mainSt.advance();
        System.out.println(mainSt.toString());
        System.out.println(mainSt.toString());
        System.out.println(mainSt.toString());
        System.out.println(mainSt.toString());
        

    }
}
