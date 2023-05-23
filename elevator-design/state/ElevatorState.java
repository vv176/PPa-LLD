package elevdesign.state;

import elevdesign.data.Direction;
import elevdesign.data.Floor;
import elevdesign.data.State;

public interface ElevatorState {
    void destine(Floor floor, Direction direction);
    void open(Floor floor);
    void close(Floor floor);
    void stop(Floor floor);
    State getName();
}
