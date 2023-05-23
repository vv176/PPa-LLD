package chess.board;

import chess.player.Player;

public interface Board {

    void applyMove(Move move);

    void display();

}
