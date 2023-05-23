package chess.game;

import chess.board.Board;
import chess.board.Move;
import chess.player.Player;

import java.util.Queue;

public abstract class BoardGame {

    private final Queue<Player> players;
    private final Board board;
    protected BoardGame(Queue<Player> players, Board board) {
        this.players = players;
        this.board = board;
    }
    

    public void start() {
        while (true) {
            Player currentPlayer = players.poll();
            Move move = currentPlayer.makeMove();
            board.applyMove(move);
            if (isOver()) {
                System.out.println("Game up! " + currentPlayer.getName()
                + " is the winner");
                break;
            }
            players.add(currentPlayer);
        }
    }

    protected abstract boolean isOver();

}
