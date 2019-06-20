package chess.domain.board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Board {

    private final List<Rank> ranks = new ArrayList<>();

    public Board() {
        List<Row> rows = Arrays.asList(Row.values());
        rows.sort(Comparator.naturalOrder());

        for (Row row : rows) {
            Rank rank = new Rank(row);
            ranks.add(rank);
        }
    }

    @Override
    public String toString() {
        return ranks.stream()
                .map(Rank::toString)
                .collect(joining("\n"));
    }
}
