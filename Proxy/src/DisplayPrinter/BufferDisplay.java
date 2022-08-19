package DisplayPrinter;

import java.util.ArrayList;

public class BufferDisplay implements Display {
    private ArrayList<String> buffer = new ArrayList<String>();//입력된 content들을 저장할 버퍼
    private ScreenDisplay screen = null;
    private int bufferSize = 0;

    public BufferDisplay(int bufferSize){
        this.bufferSize = bufferSize;
    }

    @Override
    public void print(String content) {
        buffer.add(content);
        if(buffer.size() == bufferSize){
            flush();//출력함수
        }
    }

    public void flush() {
        if(screen == null) screen = new ScreenDisplay(); // 아마도 ScreenDisplay 객체를 한 번만 생성하기 위함
        String lines = String.join("\n",buffer);
        screen.print(lines);
        buffer.clear();
    }
    
}
