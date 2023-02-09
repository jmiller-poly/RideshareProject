/*
 * RideshareRunner.java
 * @authors: Nick Gomez, James Miller
 * @version: 2/9/23
 */

public class RideshareRunner {
    public static void main(String[] args) {
        testRoad(31, 20, 50, false, false);
        testRoad(31, 10, 30, false, false);
    }

    public static void testRoad(int stations, int cars, int passengers, boolean testStatements, boolean lastCheck) {
        Road LakeSt = new Road();
        for(int s = 0; s < stations; s++) {
            LakeSt.addStation();
        }
        for(int c = 0; c < cars; c++) {
            LakeSt.addCar((int) (Math.random() * 25), (int) (Math.random() * 25));
        }
        for(int p = 0; p < passengers; p++) {
            LakeSt.addPassenger((int) (Math.random() * 25), (int) (Math.random() * 25));
        }
        for(int a = 0; LakeSt.getCarsOnRoad() > 0; a++) {
            LakeSt.advance();
            if(a%5 == 0 && testStatements) {
                System.out.println(LakeSt.toString());
            }
        }
        if(lastCheck) {
            System.out.println(LakeSt.toString());
        }
        System.out.println("\nInformation for a road with " + stations + " stations, " + cars + " cars, and " + passengers + " passengers: ");
        System.out.println("Total revenue per car: " + LakeSt.getTotalRevenue()/((double) cars));
        System.out.println("Passengers who did not make it to their destination: " + LakeSt.getLeftOverPassengers());
    }
}
