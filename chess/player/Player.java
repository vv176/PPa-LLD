package chess.player;

import chess.board.Board;
import chess.board.Move;
import chess.cell.Pair;

public abstract class Player {

    private final String name;

    protected Player(String name) {
        this.name = name;
    }

    public abstract Move makeMove();

    public String getName() {
        return this.name;
    }

}
