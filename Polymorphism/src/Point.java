import java.lang.Double;

public class Point {
    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    private double pointX;

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    private double pointY;

    public Point(double x, double y) {
        pointX = x;
        pointY = y;
    }

    /**
     * Khoang cach 2 diem.
     * @param other Diem con lai
     * @return Khoang cach
     */
    public double distance(Point other) {
        double x = Math.pow(this.pointX - other.pointX, 2);
        double y = Math.pow(this.pointY - other.pointY, 2);
        return Math.sqrt(x + y);
    }

    @Override
    public String toString() {
        return String.format("(%.1f,%.1f)", pointX, pointY);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        if (Double.compare(this.pointY, ((Point) obj).pointY) != 0) {
            return false;
        }
        return Double.compare(this.pointX, ((Point) obj).pointX) == 0;
    }
}
