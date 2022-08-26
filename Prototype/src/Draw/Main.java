package Draw;

public class Main {
  public static void main(String[] args) {
    Point pt1 = new Point();
    pt1.setX(0).setY(0);
    // System.out.println(pt1.draw());

    
    Point pt2 = new Point();
    pt2.setX(100).setY(0);
    // System.out.println(pt2.draw());

    Point pt3 = new Point();
    pt3.setX(100).setY(100);
    // System.out.println(pt3.draw());

    
    Point pt4 = new Point();
    pt4.setX(0).setY(100);
    // System.out.println(pt4.draw());

    Line line1 = new Line();
    line1.setStartPt(pt1).setEndPt(pt2);
    // System.out.println(line1.draw());

    Line line2 = new Line();
    line2.setStartPt(pt2).setEndPt(pt3);
    // System.out.println(line2.draw());

    Line line3 = new Line();
    line3.setStartPt(pt3).setEndPt(pt4);
    // System.out.println(line3.draw());

    Line line4 = new Line();
    line4.setStartPt(pt4).setEndPt(pt1);
    // System.out.println(line4.draw());

    Group rect =  new Group("RECT");
    rect.addShape(line1).addShape(line2).addShape(line3).addShape(line4);
    System.out.println(rect.draw());

    Group cloneRect = (Group)rect.copy();
    cloneRect.moveOffSet(100, 100);
    System.out.println(cloneRect.draw());
  }
}
