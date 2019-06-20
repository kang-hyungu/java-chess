package chess.domain.pice;

public class Queen implements Piece {

    private final Color color;

    public Queen(Color color) {
        this.color = color;
    }

    @Override
    public Color color() {
        return null;
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        if (color.isBlack()) {
            return "Q";
        }

        return "q";
    }
}
