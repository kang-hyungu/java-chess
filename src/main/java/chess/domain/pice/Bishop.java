package chess.domain.pice;

public class Bishop implements Piece {

    private final Color color;

    public Bishop(Color color) {
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
            return "B";
        }

        return "b";
    }
}
