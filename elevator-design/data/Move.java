package elevdesign.data;

public class Move {

    private final Floor destinationFloor;

    private final Direction destinationDirection;

    public Move(Floor destinationFloor, Direction destinationDirection) {
        this.destinationFloor = destinationFloor;
        this.destinationDirection = destinationDirection;
    }

    public Floor getDestinationFloor() {
        return destinationFloor;
    }

    public Direction getDestinationDirection() {
        return destinationDirection;
    }

}
