public abstract class AirplaneFactory {
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
