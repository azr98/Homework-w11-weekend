import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNum;
    private String destination;
    private String departure;


    public Flight(String flightNum, String destination, String departure,Plane plane){
        this.passengers = new ArrayList<Passenger>();
        this.flightNum = flightNum;
        this.destination = destination;
        this.departure = departure;
        this.plane = plane;
    }

    public int getSeatsAvailible(){
        return this.plane.getPlaneType().getCapacityFromPlane() - this.passengers.size();
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    public void bookPassenger(Passenger passenger){
        if (getSeatsAvailible() > 0) {
            this.passengers.add(passenger);
        }
    }

}
