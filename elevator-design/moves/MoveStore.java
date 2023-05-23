package elevdesign.moves;

import elevdesign.data.Direction;
import elevdesign.data.Move;

import java.util.Optional;

public interface MoveStore {

    void addMove(Move move);

    Optional<Move> getTop();

    void clearTop();

    Direction getCurrentDirection();

}
