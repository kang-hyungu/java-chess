package chess.view.input;

import spark.utils.StringUtils;

import java.util.Scanner;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void start() {
        System.out.println("체스 게임을 시작합니다.");
    }

    public static InputCommand command() {
        System.out.println("게임 시작은 start, 종료는 end 명령을 입력하세요.");
        String next = SCANNER.next();

        if (StringUtils.isBlank(next)) {
            throw new RuntimeException("문자열을 입력해주세요.");
        }

        try {
            return InputCommand.valueOf(next.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.err.println("start 또는 end 를 입력해주세요.");
            return command();
        }
    }
}
