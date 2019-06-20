package chess.domain.pice;

public class None implements Piece {
    @Override
    public Color color() {
        return null;
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return ".";
    }
}
