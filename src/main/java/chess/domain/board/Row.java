package chess.domain.board;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.NoSuchElementException;

public enum Row {
    EIGHT  (8),
    SEVENTH(7),
    SIXTH  (6),
    FIFTH  (5),
    FOURTH (4),
    THIRD  (3),
    SECOND (2),
    FIRST  (1)
    ;

    private final int row;

    Row(int row) {
        this.row = row;
    }

    public boolean isFirstBottom() {
        return this.equals(FIRST);
    }

    public boolean isSecondBottom() {
        return this.equals(SECOND);
    }

    public boolean isFirstTop() {
        return this.equals(EIGHT);
    }

    public boolean isSecondTop() {
        return this.equals(SEVENTH);
    }

    public static Row valueOfNumber(String number) {
        if (!StringUtils.isNumeric(number)) {
            throw new IllegalArgumentException("1 ~ 8 사이 숫자를 입력해주세요.");
        }

        return Arrays.stream(values())
                .filter(value -> Integer.valueOf(number) == value.row)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("몇 번째 줄인지 찾을 수 없습니다."));
    }

    public int getRow() {
        return row;
    }
}
