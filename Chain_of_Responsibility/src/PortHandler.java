
public class PortHandler extends Handler{

    @Override
    protected void process(String url) {
        int index = url.lastIndexOf(":");

        if(index != -1){
            System.out.println("Port: " + url.substring(index+1,url.length()));
        } else{
            System.out.println("No Port");
        }
    }

}