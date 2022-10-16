import java.util.ArrayList;

public class Board {

    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    private ArrayList<Piece> pieces = new ArrayList<>();

    public boolean validate(int x, int y) {
        return (x >= 1) && (x <= 8) && (y >= 1) && (y <= 8);
    }

    /**
     * Get piece at position.
     * @param x x coordinate
     * @param y y coordinate
     * @return Piece at x,y, null if not exist
     */
    public Piece getAt(int x, int y) {
        return pieces.stream()
                .filter(p -> p.getCoordinatesX() == x && p.getCoordinatesY() == y)
                .findFirst()
                .orElse(null);
    }

    /**
     * Remove piece at position.
     * @param x x coordinate
     * @param y y coordinate
     */
    public void removeAt(int x, int y) {
        pieces.stream()
                .filter(p -> p.getCoordinatesX() == x && p.getCoordinatesY() == y)
                .findFirst().ifPresent(r -> pieces.remove(r));
    }

    /**
     * Add piece to board.
     * @param piece Piece to be added
     */
    public void addPiece(Piece piece) {
        if (!validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            return;
        }

        if (getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
            pieces.add(piece);
        }
    }
}
