package DogDna.DnaClass;

import java.util.HashMap;
import java.util.Map;

public class Dog {
  private Map<String,String> dnaTable = new HashMap<String,String>();
  private String name;
  private Integer age;
  private String sex;
  private String breed;

  public Dog(String name, Integer age, String sex, String breed) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.breed = breed;
    addDna("shihTzu", "ATAGGCTTACCGATGG...");
    addDna("jinDo", "ATAGGCTTACCGATGA...");
  }

  public void addDna(String breed, String dna){
    //원래는 DNA 클래스가 따로 있어서 테이블에 DNA 클래스를 넣어줘야한다.
    this.dnaTable.put(breed, dna);
  }

  public void printDog(){
    if(!(this.dnaTable.containsKey(breed)))System.out.println(breed+" is not in DNA Table");
    else System.out.println(name+","+age+","+dnaTable.get(breed));
  }
  public static void main(String[] args) {
    Dog choco = new Dog("choco", 2, "male", "shihTzu");
    Dog baduk = new Dog("baduk", 3, "female", "jinDo");
    Dog bbobbi = new Dog("bbobbi", 1, "female", "shiba");

    // choco.addDna("shihTzu", "ATAGGCTTACCGATGG...");
    choco.printDog();
    baduk.printDog();
    bbobbi.printDog();
  }
}
// choco,2,ATAGGCTTACCGATGG...
// baduk,3,ATAGGCTTACCGATGA...
// shiba is not in DNA Table