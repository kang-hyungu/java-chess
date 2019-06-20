package chess.domain.pice;

public class Knight implements Piece {

    private final Color color;

    public Knight(Color color) {
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
            return "N";
        }

        return "n";
    }
}
