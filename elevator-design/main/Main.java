package elevdesign.main;


import elevdesign.data.Direction;
import elevdesign.data.Floor;
import elevdesign.elev.Elevator;
import elevdesign.moves.UnidirectionalMoveStore;
import elevdesign.state.IdleState;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(new UnidirectionalMoveStore());
        elevator.setState(new IdleState(elevator));
        elevator.setCurrentFloor(new Floor(0, "Ground"));
        elevator.destine(new Floor(4, "Fourth"), Direction.UP);
        System.out.println(elevator.getState().getName());
        elevator.destine(new Floor(7, "Fourth"), Direction.UP);
        elevator.setCurrentFloor(new Floor(1, "First"));
        elevator.setCurrentFloor(new Floor(2, "Second"));
        elevator.setCurrentFloor(new Floor(3, "Third"));
        elevator.destine(new Floor(1, "First"), Direction.DOWN);
        elevator.setCurrentFloor(new Floor(4, "Fourth"));
        elevator.stop(new Floor(4, "Fourth"));
        System.out.println(elevator.getState().getName());
        elevator.open(new Floor(4, "Fourth"));
        System.out.println(elevator.getState().getName());
        elevator.close(new Floor(4, "Fourth"));
        System.out.println(elevator.getState().getName());
        System.out.println(elevator.getMoveStore().getTop().get().getDestinationFloor().getNumber()
                + " " + elevator.getMoveStore().getTop().get().getDestinationDirection());
        elevator.destine(new Floor(3, "Third"), Direction.DOWN);
        elevator.setCurrentFloor(new Floor(7, "Seventh"));
        elevator.stop(new Floor(7, "Seventh"));
        System.out.println(elevator.getState().getName());
        elevator.open(new Floor(7, "Seventh"));
        System.out.println(elevator.getState().getName());
        elevator.close(new Floor(7, "Seventh"));
        System.out.println(elevator.getState().getName());
        System.out.println(elevator.getMoveStore().getTop().get().getDestinationFloor().getNumber()
                + " " + elevator.getMoveStore().getTop().get().getDestinationDirection());
        elevator.setCurrentFloor(new Floor(3, "Third"));
        elevator.stop(new Floor(3, "Third"));
        System.out.println(elevator.getState().getName());
        elevator.open(new Floor(3, "Third"));
        System.out.println(elevator.getState().getName());
        elevator.close(new Floor(3, "Third"));
        System.out.println(elevator.getState().getName());
        System.out.println(elevator.getMoveStore().getTop().get().getDestinationFloor().getNumber()
                + " " + elevator.getMoveStore().getTop().get().getDestinationDirection());
        //
        elevator.setCurrentFloor(new Floor(1, "First"));
        elevator.stop(new Floor(1, "First"));
        System.out.println(elevator.getState().getName());
        elevator.open(new Floor(1, "First"));
        System.out.println(elevator.getState().getName());
        elevator.close(new Floor(1, "First"));
        System.out.println(elevator.getState().getName());
        System.out.println(elevator.getMoveStore().getTop().isEmpty()
                + " " + elevator.getMoveStore().getTop().isEmpty());
    }
}
