public class Fighter extends AirplaneFactory{
    @Override
    Airplane createAirplane(String planeType){
        System.out.println("create "+planeType);
        return null;
    }
}