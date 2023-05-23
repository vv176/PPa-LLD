package parking.finder;

import parking.data.ParkingSpot;
import parking.manager.VehicleTypeManager;
import parking.selector.ParkingSpotSelector;

import java.util.List;

public class ParkingSpotFinder {

    private final VehicleTypeManager vehicleTypeManager;
    private final ParkingSpotSelector parkingSpotSelector;

    public ParkingSpotFinder(VehicleTypeManager vehicleTypeManager,
                             ParkingSpotSelector parkingSpotSelector) {
        this.vehicleTypeManager = vehicleTypeManager;
        this.parkingSpotSelector = parkingSpotSelector;
    }

    public ParkingSpot findParkingSpot() {
        List<ParkingSpot> parkingSpots =
                this.vehicleTypeManager.getParkingSpots();
        return this.parkingSpotSelector.selectSpot(parkingSpots);
    }

}
