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

    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.pointX - other.pointX, 2) + Math.pow(this.pointY - other.pointY, 2));
    }

    public String info() {
        return String.format("(%.2f, %.2f)", pointX, pointY);
    }
}
