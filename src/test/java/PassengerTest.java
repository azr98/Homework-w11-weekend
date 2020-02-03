import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Azhar Sharif",1);
    }

    @Test
    public void hasName(){
        assertEquals("Azhar Sharif", passenger.getName());
    }

    @Test
    public void hasNumOfBags(){
        assertEquals(1,passenger.getNumOfBags());
    }

}
