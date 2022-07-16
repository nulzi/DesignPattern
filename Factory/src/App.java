public class App {
    public static void main(String[] args) throws Exception {
        AirplaneFactory airlinerFact = new Airliner();
        AirplaneFactory fighterFact = new Fighter();

        Airplane airplane1 = airlinerFact.createAirplane("보잉");
        Airplane airplane2 = fighterFact.createAirplane("F-15");
    }
}
