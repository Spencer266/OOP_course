import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(new Point(1.435, 2.3124), 5.5538);
        System.out.println(c.getInfo());

        Triangle t = new Triangle(new Point(1, 3), new Point(1, 2.34), new Point(1, 2.5555));
        System.out.println(t.getInfo());
    }
}