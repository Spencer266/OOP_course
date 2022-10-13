public class Circle {

    protected static final double PI = 3.14;
    private double radius = 1.0;
    private String color = "red";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%.2f,color=%s]", radius, color);
    }
}
