public class Rook extends Piece {

    public Rook(int coordinateX, int coordinateY) {
        super(coordinateX, coordinateY);
    }

    public Rook(int coordinateX, int coordinateY, String color) {
        super(coordinateX, coordinateY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }

        if ((getCoordinatesX() != x) && (getCoordinatesY() != y)) {
            return false;
        }

        try {
            int next;
            if (getCoordinatesX() == x) {
                int exY = getCoordinatesY();
                next = y > exY ? 1 : -1;
                while (exY != y) {
                    if (board.getAt(x, exY) != null && exY != getCoordinatesY()) {
                        return false;
                    }
                    exY += next;
                }
                return !board.getAt(x, y).getColor().equals(getColor());
            } else {
                int exX = getCoordinatesX();
                next = x > exX ? 1 : -1;
                while (exX != x) {
                    if (board.getAt(exX, y) != null && exX != getCoordinatesX()) {
                        return false;
                    }
                    exX += next;
                }
                return !board.getAt(x, y).getColor().equals(getColor());
            }
        } catch (NullPointerException n) {
            return true;
        }
    }
}
