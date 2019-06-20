package chess.domain.pice;

public class Pawn implements Piece {

    private final Color color;

    public Pawn(Color color) {
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
            return "P";
        }

        return "p";
    }
}
