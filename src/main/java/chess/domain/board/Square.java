package chess.domain.board;

import chess.domain.pice.Piece;

public class Square {

    private final Position position;
    private final Piece piece;

    public Square(Position position, Piece piece) {
        this.position = position;
        this.piece = piece;
    }

    @Override
    public String toString() {
        return piece.toString();
    }
}
