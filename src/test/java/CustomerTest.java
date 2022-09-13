import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

    public class CustomerTest  {

        Customer customer;
        Vehicle car;
        Vehicle car1;

        @Before
        public void setUp() {
            customer = new Customer("bob", 3000.00);
            car = new Vehicle("Tesla", "something", "black", 100.00, VehicleType.ELECTRIC, 0.00);
            car1 = new Vehicle("Tesla", "something", "black", 100.00, VehicleType.ELECTRIC, 0.00);
        }

        @Test
        public void setMoney() {
            customer.setMoney(1000);
            assertEquals(2000.00,customer.getMoney(),0.0);
        }

        @Test
        public void getCollection() {
            assertEquals(0, customer.getCollection().size());
        }


        @Test
        public void getName() {
            assertEquals("bob", customer.getName());
        }

        @Test
        public void addCar(){
            customer.sellCar(car);
            assertEquals(1, customer.getCollection().size());
        }
        @Test
        public void removeCar(){
            customer.addCar(car);
            customer.addCar(car1);
            customer.removeCar(car);
            assertEquals(1, customer.getCollection().size());
        }
}
