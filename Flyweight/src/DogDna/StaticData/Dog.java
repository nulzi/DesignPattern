package DogDna.StaticData;

public class Dog {
  private static String dna = "ATAGGCTTACCGATGG....";
  private String name;
  private Integer age;
  private String sex;
  private String breed;

  public Dog(String name, Integer age, String sex, String breed) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.breed = breed;
  }

  public void printDog(){
    System.out.println(name+","+age+","+dna);
  }
  public static void main(String[] args) {
    Dog choco = new Dog("choco", 2, "male", "shigTzu");
    Dog baduk = new Dog("baduk", 3, "female", "jinDo");

    choco.printDog();
    baduk.printDog();
  }
}
// choco,2,ATAGGCTTACCGATGG....
// baduk,3,ATAGGCTTACCGATGG....