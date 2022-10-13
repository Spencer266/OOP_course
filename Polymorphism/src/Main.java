public class Main {
    public static void main(String[] args) {
        Layer l = new Layer();
        l.addShape(new Circle(new Point(1, 1), 3, "Red", true));
        l.addShape(new Circle(new Point(1, 1), 3, "Red", true));
        l.addShape(new Rectangle(new Point(2, 4), 3, 2, "Blue", false));
        l.addShape(new Square(new Point(-2, 3), 12, "Yellow", true));

        l.removeDuplicates();
        System.out.println(l.getInfo());
    }
}