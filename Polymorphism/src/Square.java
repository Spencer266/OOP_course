public class Square extends Rectangle {

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        setWidth(side);
    }

    public Square() {
    }

    public Square(double side) {
        setWidth(side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Square 4-params constructor.
     * @param topLeft top left point
     * @param side side
     * @param color color
     * @param filled filled or not
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    @Override
    public String toString() {
        String tl = topLeft.toString();
        return String.format("Square[topLeft=%s,side=%.1f,%s]", tl, getSide(), basicInfo());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square)) {
            return false;
        }
        if (Double.compare(this.width, ((Square) obj).width) != 0) {
            return false;
        }
        return this.topLeft.equals(((Square) obj).topLeft);
    }
}
