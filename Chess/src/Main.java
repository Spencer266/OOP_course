public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPiece(new Rook(1, 3, "white"));
        board.addPiece(new Rook(2, 4, "white"));
        board.addPiece(new Rook(2, 6, "black"));
        Game game = new Game(board);

        System.out.println(board.getPieces().size());
        game.movePiece(board.getAt(2, 4), 2, 6);
        System.out.println(game.getMoveHistory().get(0));
    }
}