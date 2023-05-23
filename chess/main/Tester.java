package chess.main;

import chess.board.ChessBoard;
import chess.color.Color;
import chess.game.BoardGame;
import chess.game.Chess;
import chess.piece.*;
import chess.player.ChessPlayer;
import chess.player.HumanChessPlayer;

import java.util.HashMap;
import java.util.Map;

public class Tester {

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        ChessPlayer firstPlayer = new HumanChessPlayer("Vivek",
                chessBoard, getPieces(Color.WHITE));
        ChessPlayer secondPlayer = new HumanChessPlayer("Bharat",
                chessBoard, getPieces(Color.BLACK));
        BoardGame chessBoardGame = new Chess(firstPlayer, secondPlayer, chessBoard);
        chessBoardGame.start();
    }

    private static Map<PieceName, ChessPiece> getPieces(Color color) {
        Map<PieceName, ChessPiece> pieces = new HashMap<>();
        pieces.put(PieceName.BISHOP1, new Bishop(PieceName.BISHOP1, color, false));
        pieces.put(PieceName.BISHOP2, new Bishop(PieceName.BISHOP2, color, false));
        pieces.put(PieceName.KNIGHT1, new Knight(PieceName.KNIGHT1, color, false));
        pieces.put(PieceName.KNIGHT2, new Knight(PieceName.KNIGHT2, color, false));
        pieces.put(PieceName.ROOK1, new Rook(PieceName.ROOK1, color, false));
        pieces.put(PieceName.ROOK2, new Rook(PieceName.ROOK2, color, false));
        pieces.put(PieceName.KING, new King(PieceName.KING, color, false));
        pieces.put(PieceName.QUEEN, new Queen(PieceName.QUEEN, color, false));
        pieces.put(PieceName.PAWN1, new Pawn(PieceName.PAWN1, color, false));
        pieces.put(PieceName.PAWN2, new Pawn(PieceName.PAWN2, color, false));
        pieces.put(PieceName.PAWN3, new Pawn(PieceName.PAWN3, color, false));
        pieces.put(PieceName.PAWN4, new Pawn(PieceName.PAWN4, color, false));
        pieces.put(PieceName.PAWN5, new Pawn(PieceName.PAWN5, color, false));
        pieces.put(PieceName.PAWN6, new Pawn(PieceName.PAWN6, color, false));
        pieces.put(PieceName.PAWN7, new Pawn(PieceName.PAWN7, color, false));
        pieces.put(PieceName.PAWN8, new Pawn(PieceName.PAWN8, color, false));
        return pieces;
    }

}
