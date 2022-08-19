package DisplayPrinter;

public class ScreenDisplay implements Display {

    public ScreenDisplay(){
        System.out.println("screen create");
    }

    @Override
    public void print(String content) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(content);
    }
    
}
