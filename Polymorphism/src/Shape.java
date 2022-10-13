public abstract class Shape {

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    protected String color;
    protected boolean filled;

    public abstract double getArea();

    public abstract double getPerimeter();

    String basicInfo() {
        return String.format("color=%s,filled=%b", color, filled);
    }

    @Override
    public String toString() {
        return String.format("Shape[%s]", basicInfo());
    }
}
