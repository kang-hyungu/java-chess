package chess.domain.board;

import chess.domain.pice.*;

public enum Column {
    A { public Piece toInitPiece(Color color) { return new Rook(color);   }},
    B { public Piece toInitPiece(Color color) { return new Knight(color); }},
    C { public Piece toInitPiece(Color color) { return new Bishop(color); }},
    D { public Piece toInitPiece(Color color) { return new Queen(color);  }},
    E { public Piece toInitPiece(Color color) { return new King(color);   }},
    F { public Piece toInitPiece(Color color) { return new Bishop(color); }},
    G { public Piece toInitPiece(Color color) { return new Knight(color); }},
    H { public Piece toInitPiece(Color color) { return new Rook(color);   }}
    ;

    abstract Piece toInitPiece(Color color);
}
