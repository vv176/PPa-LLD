package chess.piece;

import chess.board.ChessBoard;
import chess.cell.ChessCell;

public interface ChessPiece {

    void move(ChessCell currentCell, ChessCell destCell, ChessBoard chessBoard);

    PieceName getName();

    boolean isDead();

    void setDead(boolean dead);

}
