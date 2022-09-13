
public class Vehicle {


    String make;
    String model;
    String color;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public VehicleType getType() {
        return type;
    }


    public double getDamage(){
        return damage;
    }

    public void setDamage(double amount){
        this.damage = amount;
    }

    double price;
    Tyres tyres;
    VehicleType type;
    String engine;
    double damage;
    public Vehicle(String make, String model, String color, double price, VehicleType type, Double damage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price - damage;
        this.type =  type;
        this.tyres = new Tyres();
        this.engine = type.getEngine();
        this.damage = damage;
    }
}
