package chess.view.input;

import chess.domain.board.Board;
import chess.view.output.OutputView;

public enum InputCommand {
    START {
        public void run() {
            OutputView.print(new Board());
        }
    },
    END {
        public void run() {}
    }
    ;

    public abstract void run();
}
