
public abstract class Piece {

    private int coordinateX;
    private int coordinateY;
    private String color;

    public Piece(int coordinateX, int coordinateY, String color) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.color = color;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Piece(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.color = "white";
    }

    public abstract String getSymbol();

    public abstract boolean canMove();
}
