package Cloneable_Car;

import java.util.List;

public class CarClient {
  public static void main(String[] args) throws CloneNotSupportedException {
      Car car = new Car();
      car.listAll();

      Car car2 = (Car) car.clone();
      Car car3 = (Car) car.clone();

      List<String> car2List = car2.getCarList();
      List<String> car3List = car3.getCarList();

      car2List.add("mini car");
      car3List.remove("truck");

      System.out.println(car.getCarList());
      System.out.println(car2List);
      System.out.println(car3List);

  }
}
// 출력 결과
// [truck, suv, sedan, sports car]
// [truck, suv, sedan, sports car, mini car]
// [suv, sedan, sports car]