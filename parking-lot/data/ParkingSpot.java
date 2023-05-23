package parking.data;

public class ParkingSpot {

    private final String floorNum;
    private final VehicleType vehicleType;
    private final String name;

    public String getFloorNum() {
        return floorNum;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getName() {
        return name;
    }

    public boolean isFree() {
        return isFree;
    }

    private final boolean isFree;


    public ParkingSpot(String floorNum, VehicleType vehicleType,
                       String name, boolean isFree) {
        this.floorNum = floorNum;
        this.vehicleType = vehicleType;
        this.name = name;
        this.isFree = isFree;
    }
}
