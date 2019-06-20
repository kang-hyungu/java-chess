package chess.view.output;

import chess.domain.board.Board;

public class OutputView {

    public static void print(Board board) {
        System.out.println(board);
        System.out.println();
        System.out.println("end");
    }
}
