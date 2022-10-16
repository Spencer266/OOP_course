
public abstract class Piece {

    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * Piece Constructor.
     * @param coordinatesX x coordinate
     * @param coordinatesY y coordinate
     * @param color color
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Constructor 2-params.
     * @param coordinatesX x coordinate
     * @param coordinatesY y coordinate
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = "white";
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);
}
