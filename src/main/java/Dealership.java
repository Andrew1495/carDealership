import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class Dealership implements IAddRemoveCar{


 private HashMap<VehicleType,ArrayList<Vehicle>> stock;
 private String name;
 private double money;



 public Dealership(String name, Double money){
  this.name = name;
  this.money = money;
  this.stock = new HashMap<VehicleType,ArrayList<Vehicle>>();
 }

 public HashMap<VehicleType, ArrayList<Vehicle>> makeStock(ArrayList<Vehicle> cars) {
  for (Vehicle car : cars) {
    if(!stock.containsKey(car.type)){
     stock.put(car.type, new ArrayList<Vehicle>());
     stock.get(car.type).add(car);
    }else {
     stock.get(car.type).add(car);
    }
  }
  return stock;
 }

 public HashMap<VehicleType, ArrayList<Vehicle>> makeStock(Vehicle car) {
   if(!stock.containsKey(car.type)){
    stock.put(car.type, new ArrayList<Vehicle>());
    stock.get(car.type).add(car);
   }else {
    stock.get(car.type).add(car);
   }
  return stock;
 }


 public String getName() {
  return name;
 }

 public double getMoney() {
  return money;
 }

 public void setMoney(double amount){
  money = amount;
 }



 public void buyCar(Vehicle car, IAddRemoveCar customer){
  if (money >= car.getPrice()) {
   makeStock(car);
   customer.setMoney((customer.getMoney()) + car.getPrice());
  }
 }

 public void sellCar(Vehicle car) {
   ArrayList<Vehicle> temp = stock.get(car.type);
   temp.remove(car);
   if (temp.size() == 0) {
    stock.remove(car.type);
   }
   else {
    stock.replace(car.type, temp);
   }

  }

  public void repairCar(Vehicle car){
     if(car.getDamage() > 0 && money > car.getDamage()){
         car.setDamage(0);
         money -= car.getDamage();
     }
  }


 }



