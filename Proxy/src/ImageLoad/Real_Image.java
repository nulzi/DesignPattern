package ImageLoad;
// Real_Image.java
public class Real_Image implements Image {
	private String fileName = null;
    
    public Real_Image(String fileName) {
    	this.fileName = fileName;
        loadFromDisk(fileName);
    }
    
    private void loadFromDisk(String fileName) {
    	System.out.println("로딩: " + fileName);
    }
    
    @Override
    public void displayImage() {
        System.out.println("보여주기: " + fileName);
    }
}
