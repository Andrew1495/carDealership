import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DealershipTest {

    Dealership dealership;
    @Before
    public void setUp(){
        dealership = new Dealership("bob's", 100000.00);

    }
    @Test
    public void getName() {
        assertEquals("bob's", dealership.getName());
    }

    @Test
    public void getMoney() {
        assertEquals(100000.00, dealership.getMoney(), 0.0);
    }
}