package Cloneable_Car;

import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable{
  private List<String> carList;

  public Car(){//기본 생성자
    this.carList = new ArrayList<>();
  }

  public Car(List<String> carList){//생성자2
    this.carList = carList;
  }

  public List<String> getCarList(){
    return this.carList;
  }

  public void listAll(){
    this.carList.add("truck");
    this.carList.add("suv");
    this.carList.add("sedan");
    this.carList.add("sports car");
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return new Car(new ArrayList<>(this.carList));
  }
}