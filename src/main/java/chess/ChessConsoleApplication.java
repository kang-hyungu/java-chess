package chess;

import chess.view.input.InputCommand;
import chess.view.input.InputView;

public class ChessConsoleApplication {

    public static void main(String[] args) {
        InputView.start();

        InputCommand command = InputView.command();
        command.run();
    }
}
