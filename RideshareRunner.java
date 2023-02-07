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
        System.out.println(mainSt.toString() + "\n");
        mainSt.addCar(2, 4);
        mainSt.addCar(1, 4);
        System.out.println(mainSt.toString() + "\n");
        mainSt.addPassenger(1, 3);
        mainSt.addPassenger(4, 2);
        System.out.println(mainSt.toString() + "\n");
        mainSt.advance();
        System.out.println(mainSt.toString() + "\n");
        mainSt.advance();
        //System.out.println(mainSt.toString() + "\n");
        //System.out.println(mainSt.toString() + "\n");
        //System.out.println(mainSt.toString() + "\n");
        System.out.println(mainSt.toString() + "\n");        

    }
}
