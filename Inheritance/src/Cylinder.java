public class Cylinder extends Circle {
    private double height = 1.0;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {}

    public Cylinder(double radius)  {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + height * 2 * PI * getRadius();
    }

    @Override
    public String toString() {
        return String.format("Cylinder[%s,height=%.2f]", super.toString(), height);
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
