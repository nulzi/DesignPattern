package DisplayPrinter;

public class Main {
    public static void main(String[] args) {
        // Display printer = new ScreenDisplay();
        Display printer = new BufferDisplay(5);

        printer.print("flow");
        printer.print("flow2");
        printer.print("flow3");
        printer.print("flow4");
        printer.print("flow5");
        printer.print("flow6");
        
        ((BufferDisplay)printer).flush();
    }
}
// flow
// flow2
// flow3
// flow4
// flow5
// flow6 >>sleep(500) 뒤에 결과 출력