package Factory;

public interface Airplane { //product
    public void takeOff();
    public void fly();
    public void land();
}
package Factory;

abstract class AirplaneFactory {
    public Airplane preparingAirplane(String planeType) {
        Airplane airplane = createAirplane(planeType);

        airplane.takeOff();
        airplane.fly();
        airplane.land();

        return airplane;
    }

	//생성담당
    abstract Airplane createAirplane(String planeType);
}
package Factory;

public class Airliner extends AirplaneFactory {
    @Override
    Airplane createAirplane(String planeType) {
        return null;
    }
}
package Factory;

public class Fighter extends AirplaneFactory {
    @Override
    Airplane createAirplane(String planeType) {
        return null;
    }
}
package Factory;

public class AirPortSystem {
    public static void main(String[] args) {
        AirplaneFactory airlinerFact = new Airliner();
        AirplaneFactory fighterFact = new Fighter();

        Airplane airplane1 = airlinerFact.createAirplane("보잉");
        Airplane airplane2 = fighterFact.createAirplane("F-15");
    }
}