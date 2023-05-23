package parking.selector;

import parking.data.ParkingSpot;

import java.util.List;

public interface ParkingSpotSelector {

    ParkingSpot selectSpot(List<ParkingSpot> parkingSpots);

}
