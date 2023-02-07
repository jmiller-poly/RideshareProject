/*
 * RideshareRunner.java
 * @authors: Nick Gomez, James Miller
 * @version: 2/7/23
 */

public class RideshareRunner {
    public static void main(String[] args) {
        Road mainSt = new Road();
        for(int i = 0; i < 5; i++) {
            mainSt.addStation();
        }
        System.out.println(mainSt.toString() + "\n");
        mainSt.addCar(2, 4);
        System.out.println(mainSt.toString() + "\n");
        mainSt.addPassenger(1, 3);
        mainSt.addPassenger(1, 3);
        mainSt.addPassenger(4, 1);
        mainSt.addPassenger(4, 1);
        System.out.println(mainSt.toString() + "\n");
        mainSt.advance();
        System.out.println(mainSt.toString() + "\n");
        mainSt.advance();
        System.out.println(mainSt.toString() + "\n");        
        mainSt.advance();
        System.out.println(mainSt.toString() + "\n");        
        mainSt.advance();
        System.out.println(mainSt.toString() + "\n");        
        mainSt.advance();

        mainSt.addCar(0, 4);
        mainSt.addCar(4, 0);
        System.out.println(mainSt.toString() + "\n");        
        mainSt.advance();
        System.out.println(mainSt.toString() + "\n");        
        mainSt.advance();
        System.out.println(mainSt.toString() + "\n");        
        mainSt.advance();
        System.out.println(mainSt.toString() + "\n");        
        mainSt.advance();
        System.out.println(mainSt.toString() + "\n");        
        mainSt.advance();
        System.out.println(mainSt.toString() + "\n");        
        
        
        
    }
}
