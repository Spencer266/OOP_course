import java.util.ArrayList;

public class Board {

    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    public boolean validate(int x, int y) {
        return (x >= 1) && (x <= 8) && (y >= 1) && (y <= 8);
    }

    public Piece getAt(int x, int y) {
        return null;
    }
}
