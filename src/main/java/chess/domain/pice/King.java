package chess.domain.pice;

public class King implements Piece {

    private final Color color;

    public King(Color color) {
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
            return "K";
        }

        return "k";
    }
}
