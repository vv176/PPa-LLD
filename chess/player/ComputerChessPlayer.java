package chess.player;

import chess.board.Board;
import chess.board.ChessBoard;
import chess.board.Move;
import chess.cell.Pair;
import chess.piece.ChessPiece;
import chess.piece.PieceName;

import java.util.Map;

public class ComputerChessPlayer extends ChessPlayer{


    public ComputerChessPlayer(String name, ChessBoard chessBoard,
                               Map<PieceName, ChessPiece> pieces) {
        super(pieces, chessBoard, name);
    }

    @Override
    public Move makeMove() {
        return null;
    }

}
