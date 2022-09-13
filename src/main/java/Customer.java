import java.util.ArrayList;

public class Customer implements IAddRemoveCar{

    private ArrayList<Vehicle> collection;
    private double money;
    private String name;


    public Customer(String name, double money) {
        this.name = name;
        this.collection = new ArrayList<Vehicle>();
        this.money = money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getCollection() {
        return collection;
    }

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void addCar(Vehicle car){
        collection.add(car);

    }
    public void removeCar(Vehicle car){
        collection.remove(car);

    }

    public void sellCar(Vehicle car){
            collection.remove(car);

        }

    public void buyCar(Vehicle car, IAddRemoveCar dealership){
        if(money >= car.getPrice()){
            collection.add(car);
            dealership.sellCar(car);
            dealership.setMoney((dealership.getMoney() + car.price));
        }
    }
}
