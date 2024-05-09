public class AirportSimulator {
    private final Queue<Airplane> landingQueue = new Queue<>();
    private final Queue<Airplane> takeoffQueue = new Queue<>();

    public void addPlaneToLandingQueue(Airplane plane) {
        landingQueue.enqueue(plane);
    }

    public void addPlaneToTakeoffQueue(Airplane plane) {
        takeoffQueue.enqueue(plane);
    }

    public void processRunway() {
        if (!landingQueue.isEmpty()) {
            Airplane plane = landingQueue.dequeue();
            System.out.println(plane.getIdentifier() + " has landed.");
        } else if (!takeoffQueue.isEmpty()) {
            Airplane plane = takeoffQueue.dequeue();
            System.out.println(plane.getIdentifier() + " has taken off.");
        }
    }

    public boolean isLandingQueueEmpty() {
        return landingQueue.isEmpty();
    }

    public boolean isTakeoffQueueEmpty() {
        return takeoffQueue.isEmpty();
    }
}
