package chess.domain.pice;

public class Rook implements Piece {

    private final Color color;

    public Rook(Color color) {
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
            return "R";
        }

        return "r";
    }
}
