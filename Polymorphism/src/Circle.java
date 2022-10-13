public class Circle extends Shape {

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected double radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    protected Point center;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Circle 4-params constructor.
     * @param center center point
     * @param radius radius
     * @param color color
     * @param filled filled or not
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        setCenter(center);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        String c = center.toString();
        return String.format("Circle[center=%s,radius=%.1f,%s]", c, radius, basicInfo());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        if (Double.compare(this.radius, ((Circle) obj).radius) != 0) {
            return false;
        }
        return this.center.equals(((Circle) obj).center);
    }
}
