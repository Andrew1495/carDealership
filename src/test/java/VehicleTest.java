import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    Vehicle  vehicle;
    @Before
    public void setUp() {
        vehicle = new Vehicle("Tesla", "something", "black", 100.00, VehicleType.ELECTRIC);
    }

    @Test
    public void getMake() {
        assertEquals("Tesla", vehicle.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("something", vehicle.getModel());
    }

    @Test
    public void getColor() {
        assertEquals("black", vehicle.getColor());
    }

    @Test
    public void getPrice() {
        assertEquals(100.00, vehicle.getPrice(),0.0);
    }

    @Test
    public void getTyres() {
        assertEquals(4, vehicle.tyres.getTyres());
    }

    @Test
    public void getType() {
        assertEquals(VehicleType.ELECTRIC, vehicle.getType());
    }

    @Test
    public void getEngine() {
        assertEquals("electric", vehicle.type.getEngine());
    }
}