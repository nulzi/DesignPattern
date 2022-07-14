import java.util.Scanner;

//State Pattern
//FSM
//신호등, 프로그래밍 태스크와 같은 상태를 가지고 있고, 상태에 따라 결과(행동)가 달라지는 상황에서
//직접 상태를 체크하지 않고 상태를 객체화해서 상태가 결과(행동)를 나타낼 수 있는 패턴
//예) 신호등이 초록불일 경우 시간이 지나면 빨간불이 된다. 반대로 빨간불일 경우 시간이 지나 초록불이 된다. 그리고 버튼을 누르면 각 상태(초록불, 빨간불)를 알려준다.
//상태를 객체화 한 패턴, 조건절을 효과적으로 줄여주는 패턴
public class App {
    //플레이어의 상태 변화
    //서기, 앉기, 걷기, 뛰기 상태를 객체화한 상태 패턴
    public static void main(String[] args) throws Exception {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("플레이어의 상태: "+player.getState().getDescription()+"/ 속도: " + player.getSpeed()+ "km/h");

            System.out.print("[1] 제자리 서기 [2] 앉기 [3] 걷기 [4]뛰기 [5]종료: ");

            String input = scanner.next();
            System.out.println();

            if(input.equals("1")) player.getState().standUP();
            else if(input.equals("2")) player.getState().sitDown();
            else if(input.equals("3")) player.getState().walk();
            else if(input.equals("4")) player.getState().run();
            else if(input.equals("5")) break;
        }

        scanner.close();
    }
}
