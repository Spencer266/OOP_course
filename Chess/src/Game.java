import java.util.ArrayList;

public class Game {

    public Game(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    private Board board;
    private final ArrayList<Move> moveHistory = new ArrayList<>();

    /**
     * Move a piece on board.
     * @param piece piece to move
     * @param x x coordinate
     * @param y y coordinate
     */
    public void movePiece(Piece piece, int x, int y) {
        int currentX = piece.getCoordinatesX();
        int currentY = piece.getCoordinatesY();
        if (piece.canMove(this.board, x, y)) {
            Piece at = board.getAt(x, y);
            if  (at != null) {
                board.removeAt(x, y);
                moveHistory.add(new Move(currentX, x, currentY, y, piece, at));
            } else {
                moveHistory.add(new Move(currentX, x, currentY, y, piece));
            }
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }

}
