package ImageLoad;
// Proxy_Pattern.java
public class App {
    public static void main(String args[]) {
        Image image1 = new Proxy_Image("test1.jpg");
        Image image2 = new Proxy_Image("test2.jpg");
        
        image1.displayImage();
        image2.displayImage();
    }
}
// 로딩: test1.jpg
// 보여주기: test1.jpg
// 로딩: test2.jpg
// 보여주기: test2.jpg