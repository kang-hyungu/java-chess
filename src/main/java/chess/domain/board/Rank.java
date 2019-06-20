package chess.domain.board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Rank {

    private final List<Square> squares = new ArrayList<>();

    public Rank(Row row) {
        List<Column> columns = Arrays.asList(Column.values());
        columns.sort(Comparator.naturalOrder());

        for (Column column : columns) {
            Position position = new Position(column, row);
            Square square = new Square(position, position.initPiece());
            squares.add(square);
        }
    }

    @Override
    public String toString() {
        return squares.stream()
                .map(Square::toString)
                .collect(joining(""));
    }
}
