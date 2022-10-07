public class Triangle implements GeometricObject {

    private final Point p1;
    private final Point p2;
    private final Point p3;

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double getArea() {
        double c1 = p1.getPointX()*(p2.getPointY() - p3.getPointY());
        double c2 = p2.getPointX()*(p3.getPointY() - p1.getPointY());
        double c3 = p3.getPointX()*(p1.getPointY() - p3.getPointY());
        return Math.abs(c1 + c2 + c3)/2;
    }

    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    @Override
    public String getInfo() {
        return null;
    }
}
