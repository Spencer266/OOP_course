public class Rectangle extends Shape {
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    protected Point topLeft;
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    /**
     * Rectangle 4-params constructor.
     * @param width width
     * @param length length
     * @param color color
     * @param filled filled or not
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Rectangle 5-params constructor.
     * @param topLeft top left point
     * @param width width
     * @param length length
     * @param color color
     * @param filled filled or not
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        setTopLeft(topLeft);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        String tl = topLeft.toString();
        double w = width;
        double l = length;
        String b = basicInfo();
        return String.format("Rectangle[topLeft=%s,width=%.1f,length=%.1f,%s]", tl, w, l, b);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        if (Double.compare(this.width, ((Rectangle) obj).width) != 0) {
            return false;
        }
        if (Double.compare(this.length, ((Rectangle) obj).length) != 0) {
            return false;
        }
        return topLeft.equals(((Rectangle) obj).topLeft);
    }
}
