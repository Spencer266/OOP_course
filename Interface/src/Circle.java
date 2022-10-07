public class Circle implements GeometricObject {
    public static final double PI = 3.14;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    private Point center;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    public Circle(Point center, double radius) {
        setCenter(center);
        setRadius(radius);
    }


    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String getInfo() {
        String centerS = center.info();
        return String.format("Circle[%s,r=%.2f]", centerS, radius);
    }
}
