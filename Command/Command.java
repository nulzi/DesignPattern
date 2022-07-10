public interface Command {
    public void execute();
}

public class ComputerOnCommand implements Command{
    private Computer computer;

    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }
    
    @Override
    public void execute() {
        computer.turnOn();
    }
}

public class ComputerOffCommand implements Command {
    private Computer computer;

    public ComputerOffCommand(Computer computer) {
        this.computer = computer;
    }
    
    @Override
    public void execute() {
        computer.turnOff();
    }
}

public class Computer {
    public void Computer() {}

    public void turnOn() {
        System.out.println("컴퓨터 전원 켜짐");
    }

    public void turnOff() {
        System.out.println("컴퓨터 전원 꺼짐");
    }
}
public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
    }
}
public static void main(String[] args) {
    Computer computer = new Computer();	//컴퓨터는 리시버

//컴퓨터 객체 생성
    ComputerOnCommand computerOnCmd = new ComputerOnCommand(computer);
    ComputerOffCommand computerOffCmd = new ComputerOffCommand(computer);

    Button btn = new Button(computerOnCmd);	//버튼이 인보커 역할
    btn.pressButton();
    btn.setCommand(computerOffCmd);
    btn.pressButton();
}