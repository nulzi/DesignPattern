// adapter (wrapper)
// 기존의 코드와 연결되지 않은 코드를 adapter를 통해 호출한다.
// 연관성 없는 두 객체 묶어 사용
// 주어진 알고리즘을 요구사항에 맞게 사용할 수 있다.
public class Main{

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.walk();

        // error
        // Animal fish = Fish();
        // fish.walk();

        Fish fish = new Fish();
        Animal fishAdapter = new FishAdapter(fish);
        fishAdapter.walk();
    }
}