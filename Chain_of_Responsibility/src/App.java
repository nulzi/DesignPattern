public class App {
    public static void main(String[] args) throws Exception {
        ProtocolHandler handler1 = new ProtocolHandler();
        DomainHandler handler2 = new DomainHandler();
        PortHandler handler3 = new PortHandler();
        
        String url = "https://www.naver.com:1077";
        System.out.println("Input: "+url);

        handler1.setNext(handler2).setNext(handler3);

        handler1.run(url);
    }
}
// Input: https://www.naver.com:1077
// Protocol: https
// Domain: www.naver.com
// Port: 1077