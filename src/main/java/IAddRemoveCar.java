public interface IAddRemoveCar {

    public void buyCar(Vehicle car, IAddRemoveCar seller);


    public void sellCar(Vehicle car);

    public double getMoney();
    public void setMoney(double amount);



}
