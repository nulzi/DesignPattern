public class Main {
        // 말그대로 관찰자가 존재하는 패턴, subscriber, listener라고도 불림
        // 관찰자를 두어 event가 발생했음을 알 수 있게 만들었다
        // 이 방법을 사용하지 않으면 polling이라는 방법을 사용하는데,
        // polling은 1초, 1분, 1시간 등 정해진 시간마다 event가 발생했는지 확인하는 방법
        // polling은 1시간 이내에 event가 발생했다 사라지면 알 수가 없다는 단점이 있다

        // observer
        // update() 함수를 가짐
        // Event 클래스에는 observer 리스트를 가지고 addobserver(), notify() 함수를 가짐

        // 발생할 수 있는 문제점
        // 멀티 스레드 환경에서 막 등록된 옵저버가 알림을 받지 못하는 경우
        // 또는 막 삭제된 옵저버가 잘못 알림을 받는 경우
    public static void main(String[] args) {
        Owner owner = new Owner();
        Observer cat = new Cat();
        Observer dog = new Dog();

        owner.register(cat);
        owner.register(dog);

        owner.check();

        owner.unregister(dog);

        owner.check();
    }
}
