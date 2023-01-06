package _1_classes_and_objects.params.own;

public class MyParamTest {
    public static void main() {

        int x = 5;
        int y = 5;
        System.out.println("Before x = " + x + "\nBefore y = " + y);
        changeValue(x, y);
        System.out.println("After x = " + x + "\nAfter y = " + y);

        Point point = new Point(x,y);
        System.out.println("Point Before x = "+point.getX()+"\nPoint Before y = "+point.getY());
        changeValue(point);
        System.out.println("Point After x = "+point.getX()+"\nPoint After y = "+point.getY());
    }

    public static void changeValue(int x, int y) {
        x = x + 1;
        y = y + 1;
       /* x++;
        y++;*/
        System.out.println("In method x = " + x + "\nIn method y = " + y);
    }

    public static void changeValue(Point point) {
        point.setX(point.getX() + 1);
        point.setY(point.getY() + 1);
        System.out.println("In method x = " + point.getX() + "\nIn method y = " + point.getY());

    }
}
