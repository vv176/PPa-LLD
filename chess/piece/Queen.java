package chess.piece;

import chess.board.ChessBoard;
import chess.cell.ChessCell;
import chess.color.Color;

public class Queen implements ChessPiece{

    private final PieceName pieceName;
    private final Color color;
    private boolean isDead;

    public Queen(PieceName pieceName, Color color, boolean isDead) {
        this.pieceName = pieceName;
        this.color = color;
        this.isDead = isDead;
    }

    @Override
    public void move(ChessCell currentCell, ChessCell destCell, ChessBoard chessBoard) {

    }

    public PieceName getName() {
        return this.pieceName;
    }

    public boolean isDead() {
        return false;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
