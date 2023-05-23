package chess.player;

import chess.board.Board;
import chess.board.ChessBoard;
import chess.board.Move;
import chess.cell.Pair;
import chess.piece.ChessPiece;
import chess.piece.PieceName;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class  HumanChessPlayer extends ChessPlayer{


    public HumanChessPlayer(String name, ChessBoard chessBoard,
                            Map<PieceName, ChessPiece> pieces) {
        super(pieces, chessBoard, name);
    }

    @Override
    public Move makeMove() {
        Pair source = null;
        // logic to get source; e.g. display then scan from console
        getChessBoard().display();
        int x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt(); y = scanner.nextInt(); source = new Pair(x, y);
        Optional<ChessPiece> chessPiece = this.getChessBoard().getCell(source).getChessPiece();
        if (!chessPiece.isPresent())
            throw new RuntimeException("Invalid spot");
        if (!chessPiece.get().equals(getPiece(chessPiece.get().getName())))
            throw new RuntimeException("Illegal piece chosen");
        Pair destination = null;
        x = scanner.nextInt(); y = scanner.nextInt(); destination = new Pair(x, y);
        // logic to get destination and validate | No checks | check at move side
        return new Move(source, destination);
    }

}
