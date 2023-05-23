package chess.game;

import chess.board.ChessBoard;
import chess.piece.Pawn;
import chess.piece.PieceName;
import chess.player.ChessPlayer;
import chess.player.Player;

import java.util.*;

public class Chess extends BoardGame{

    private final ChessPlayer firstPlayer;
    private final ChessPlayer secondPlayer;


    public Chess(ChessPlayer firstPlayer, ChessPlayer secondPlayer, ChessBoard board) {
        super(new ArrayDeque<Player>(Arrays.asList(firstPlayer, secondPlayer)) , board);
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        // prepare board
        prepareBoard(firstPlayer, secondPlayer, board);
    }

    @Override
    protected boolean isOver() {
        return firstPlayer.getPiece(PieceName.KING).isDead()
                || secondPlayer.getPiece(PieceName.KING).isDead();
    }

    private void prepareBoard(ChessPlayer firstPlayer,
                              ChessPlayer secondPlayer, ChessBoard board) {
        placePawns(1, board, firstPlayer);
        placePawns(6, board, secondPlayer);
        placeRooks(0, board, firstPlayer);
        placeRooks(7, board, secondPlayer);
        placeKnights(0, board, firstPlayer);
        placeKnights(7, board, secondPlayer);
        placeBishops(0, board, firstPlayer);
        placeBishops(7, board, secondPlayer);
        placeKing(0, board, firstPlayer);
        placeKing(7, board, secondPlayer);
        placeQueen(0, board, firstPlayer);
        placeQueen(7, board, secondPlayer);
    }

    private void placePawns(int row, ChessBoard board, ChessPlayer player) {
        List<PieceName> pieceNames =
                Arrays.asList(PieceName.PAWN1,PieceName.PAWN2,PieceName.PAWN3, PieceName.PAWN4,
                        PieceName.PAWN5, PieceName.PAWN6, PieceName.PAWN7, PieceName.PAWN8);
        int col = 0;
        for (PieceName pieceName : pieceNames) {
            board.putPiece(player.getPiece(pieceName), row, col++);
        }
    }

    private void placeRooks(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.ROOK1), row, 0);
        board.putPiece(player.getPiece(PieceName.ROOK1), row, 7);
    }

    private void placeKnights(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.KNIGHT1), row, 1);
        board.putPiece(player.getPiece(PieceName.KNIGHT2), row, 6);
    }

    private void placeBishops(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.BISHOP1), row, 2);
        board.putPiece(player.getPiece(PieceName.BISHOP2), row, 5);
    }

    private void placeKing(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.KING), row, 3);
    }

    private void placeQueen(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.QUEEN), row, 4);
    }

}
