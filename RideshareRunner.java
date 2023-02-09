/*
 * RideshareRunner.java
 * @authors: Nick Gomez, James Miller
 * @version: 2/9/23
 */

public class RideshareRunner {
    public static void main(String[] args) {
        loopRoad(31, 20, 50, 50, false, false);
        loopRoad(31, 10, 30, 50, false, false);
    }

    public static int[] testRoad(int stations, int cars, int passengers, boolean testStatements, boolean lastCheck) {
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
        int[] info = new int[2];
        info[0] = LakeSt.getTotalRevenue();
        info[1] = LakeSt.getLeftOverPassengers();

        return info;
    }

    public static void loopRoad(int stations, int cars, int passengers, int loopNum, boolean testStatements, boolean lastCheck) {
        double avgRev = 0.0;
        double avgLOP = 0.0;
        for(int i = 0; i < loopNum; i++) {
            int[] info = testRoad(stations, cars, passengers, testStatements, lastCheck);
            avgRev += info[0];
            avgLOP += info[1];
        }
        System.out.println("\nAverage information for a road with " + stations + " stations, " + cars + " cars, and " + passengers + " passengers over " + loopNum + " loops: ");
        System.out.println("Average total revenue: $" + Math.round(avgRev/loopNum*100)/100.0);
        System.out.println("Per car: $" + Math.round(avgRev/(loopNum*cars)*100)/100.0);
        System.out.println("Average passengers who did not make it to their destination: " + avgLOP/loopNum);
    }
}
