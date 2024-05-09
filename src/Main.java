public class Main {
    public static void main(String[] args) {
        AirportSimulator airport = new AirportSimulator();

        airport.addPlaneToLandingQueue(new Airplane("Flight 101"));
        airport.addPlaneToLandingQueue(new Airplane("Flight 102"));
        airport.addPlaneToTakeoffQueue(new Airplane("Flight 201"));
        airport.addPlaneToTakeoffQueue(new Airplane("Flight 202"));
        airport.addPlaneToLandingQueue(new Airplane("Flight 103"));
        airport.addPlaneToLandingQueue(new Airplane("Flight 104"));
        airport.addPlaneToLandingQueue(new Airplane("Flight 105"));
        airport.addPlaneToLandingQueue(new Airplane("Flight 106"));




        while (!airport.isLandingQueueEmpty() || !airport.isTakeoffQueueEmpty()) {
            airport.processRunway();
        }

        System.out.println("All planes have landed and taken off successfully.");
    }
}
