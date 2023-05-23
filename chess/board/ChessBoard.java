package chess.board;

import chess.cell.ChessCell;
import chess.cell.Pair;
import chess.piece.ChessPiece;
import chess.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChessBoard implements Board {

    private final List<List<ChessCell>> cells;
    private static final int rowCount = 8;
    private static final int colCount = 8;

    public ChessBoard() {
        this.cells = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            List<ChessCell> rowCells = new ArrayList<>(8);
            for (int j = 0; j < colCount; j++) {
                rowCells.add(new ChessCell(i, j));
            }
            this.cells.add(rowCells);
        }
    }

    @Override
    public void applyMove(Move move) {
        ChessCell sourceCell = getCell(move.getSource());
        ChessPiece currentPiece =
                sourceCell.getChessPiece().get();
        currentPiece.move(sourceCell, getCell(move.getDestination()), this);
    }

    @Override
    public void display() {
        // logic to draw or display
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                if (!cells.get(row).get(col).getChessPiece().isPresent())
                    System.out.print("0 | ");
                else
                    System.out.print(cells.get(row).get(col).getChessPiece()
                            .get().getName().name() + " | ");
            }
            System.out.println();
        }
    }

    public ChessCell getCell(Pair chosenSpot) {
        return cells.get(chosenSpot.getX()).get(chosenSpot.getY());
    }

    public List<List<ChessCell>> getCells() {
        return cells;
    }

    public void putPiece(ChessPiece chessPiece, int row, int col) {
        cells.get(row).get(col).setChessPiece(Optional.of(chessPiece));
    }

}
