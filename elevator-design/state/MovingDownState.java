package elevdesign.state;

import elevdesign.data.Direction;
import elevdesign.data.Floor;
import elevdesign.data.Move;
import elevdesign.data.State;
import elevdesign.elev.Elevator;

public class MovingDownState implements ElevatorState{
    private final Elevator elevator;

    public MovingDownState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void destine(Floor floor, Direction direction) {
        this.elevator.getMoveStore().addMove(new Move(floor,direction));
        Direction topDirection = this.elevator.getMoveStore().getTop().get()
                .getDestinationDirection();
        if (topDirection.equals(Direction.UP))
            this.elevator.setState(new MovingUpState(this.elevator));
    }

    @Override
    public void open(Floor floor) {
        throw new RuntimeException();
    }

    @Override
    public void close(Floor floor) {
        throw new RuntimeException();
    }

    @Override
    public void stop(Floor floor) {
// more code
        this.elevator.getMoveStore().clearTop();
        this.elevator.setState(new IdleState(this.elevator));
    }

    @Override
    public State getName() {
        return State.MOVINGDOWN;
    }
}
