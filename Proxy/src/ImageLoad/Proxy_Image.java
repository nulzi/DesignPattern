package ImageLoad;

// Proxy_Image.java
public class Proxy_Image implements Image {
    private String fileName = null;
    private Real_Image realImage = null;
    
    public Proxy_Image(String fileName) {
    	this.fileName = fileName;
    }
    
    @Override
    public void displayImage() {
    	if (realImage == null) {
        	realImage = new Real_Image(fileName);
        }
        realImage.displayImage();
    }
}