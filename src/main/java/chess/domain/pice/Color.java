package chess.domain.pice;

public enum Color {

    BLACK,
    WHITE
    ;

    public boolean isBlack() {
        return BLACK.equals(this);
    }
}
