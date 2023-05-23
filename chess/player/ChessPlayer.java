package chess.player;

import chess.board.ChessBoard;
import chess.piece.ChessPiece;
import chess.piece.PieceName;

import java.util.Map;

public abstract class ChessPlayer extends Player {

    private final Map<PieceName, ChessPiece> pieces;

    private final ChessBoard chessBoard;

    protected ChessPlayer(Map<PieceName, ChessPiece> pieces, ChessBoard chessBoard, String name) {
        super(name);
        this.pieces = pieces;
        this.chessBoard = chessBoard;
    }

    public ChessPiece getPiece(PieceName pieceName) {
        if (!this.pieces.containsKey(pieceName))
            throw new IllegalArgumentException("Invalid piece name");
        return this.pieces.get(pieceName);
    }

    public Map<PieceName, ChessPiece> getPieces() {
        return pieces;
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

}
