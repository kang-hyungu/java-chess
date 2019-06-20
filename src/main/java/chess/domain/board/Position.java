package chess.domain.board;

import chess.domain.pice.Color;
import chess.domain.pice.None;
import chess.domain.pice.Pawn;
import chess.domain.pice.Piece;

public class Position {

    private final Column column;
    private final Row row;

    public Position(Column column, Row row) {
        this.column = column;
        this.row = row;
    }

    public Piece initPiece() {
        if (row.isFirstTop()) {
            return column.toInitPiece(Color.BLACK);
        }

        if (row.isSecondTop()) {
            return new Pawn(Color.BLACK);
        }

        if (row.isSecondBottom()) {
            return new Pawn(Color.WHITE);
        }

        if (row.isFirstBottom()) {
            return column.toInitPiece(Color.WHITE);
        }

        return new None();
    }

    @Override
    public String toString() {
        return column.name().toLowerCase() + row.getRow();
    }
}
