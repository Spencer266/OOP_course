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

    /**
     * Triangle constructor.
     * @param p1 point 1
     * @param p2 point 2
     * @param p3 point 3
     */
    public Triangle(Point p1, Point p2, Point p3) {
        double d1 = p1.distance(p2);
        double d2 = p2.distance(p3);
        double d3 = p3.distance(p1);
        if ((d1 == 0) || (d2 == 0) || (d3 == 0)) {
            throw new RuntimeException("2 diem trung nhau");
        }

        if ((d1 + d2 == d3) || (d2 + d3 == d1) || (d1 + d3 == d2)) {
            throw new RuntimeException("3 diem thang hang");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double getArea() {
        double c1 = p1.getPointX() * (p2.getPointY() - p3.getPointY());
        double c2 = p2.getPointX() * (p3.getPointY() - p1.getPointY());
        double c3 = p3.getPointX() * (p1.getPointY() - p3.getPointY());
        return Math.abs(c1 + c2 + c3) / 2;
    }

    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    @Override
    public String getInfo() {
        String p1Str = p1.info();
        String p2Str = p2.info();
        String p3Str = p3.info();
        return String.format("Triangle[%s,%s,%s]", p1Str, p2Str, p3Str);
    }
}
