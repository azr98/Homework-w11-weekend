import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;

    private Passenger azhar;
    private Passenger aaida;
    private  Passenger esa;
    private Passenger tariq;
    private Passenger robina;
    private Passenger extraPassenger;

    private ArrayList<Passenger> passengers;

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);

        azhar = new Passenger("azhar",1);
        aaida = new Passenger("aaida",1);
        esa = new Passenger("esa",1);
        tariq = new Passenger("Tariq",2);
        robina = new Passenger("Robina",3);
        extraPassenger = new Passenger("Jeff",0);

        flight = new Flight("LTN278","LTN","18:00",plane);

        flight.bookPassenger(azhar);
        flight.bookPassenger(aaida);
        flight.bookPassenger(esa);
        flight.bookPassenger(tariq);
        flight.bookPassenger(robina);

    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(extraPassenger);
        assertEquals(6,flight.getNumberOfPassengers());
    }


    @Test
    public void canGetAvailableSeats(){
        assertEquals(411,flight.getSeatsAvailible());
    }

}
