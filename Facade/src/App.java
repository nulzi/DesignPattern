//facade pattern
//facade: 정면
//여러 객체들 사이의 복잡한 관계와 사용을 블랙박스화해서 단순하게 만들어 주는 패턴
//내가 이해한 것: 여러 다양한 기능들을 하나의 기능으로 조절할 수 있게 해주는 것. 미리 세팅해둔 것을 사용하는 것.
//장점: 어떤 기능을 사용하기 위해서 모든 클래스의 관계를 파악하지 않고, facade에 해당하는 클래스만 이해하면 된다.
//      기능에 대한 클래스를 공개 시 facade 클래스만 공개하면 된다.
//      만약 facade 패턴을 사용하지 않을 경우 고쳐야 하는 부분이 늘어난다.
public class App {
    // 세탁을 할 때 물이 나오고 거품이 나오고 바람이 나오는 것
    public static void main(String[] args) throws Exception {
        // Wash wash = new Wash();
        // Bubble bubble = new Bubble();
        // Air air = new Air();
        Facade washer = new Facade();

        // wash.startWash();
        // bubble.startBubble();
        // air.startAir();
        washer.washing();
    }
}
/*
Start Washing
start Bubble
start Air  
 */