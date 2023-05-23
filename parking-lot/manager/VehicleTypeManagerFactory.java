package parking.manager;

import parking.data.VehicleType;

public class VehicleTypeManagerFactory {


    private VehicleTypeManagerFactory(){}

    public static VehicleTypeManager getVehicleTypeManager(VehicleType vehicleType)
    {
        VehicleTypeManager vehicleTypeManager = null;
        if (vehicleType.equals(VehicleType.TWO_WHEELER))
            vehicleTypeManager = new TwoWheelerManager();


        return vehicleTypeManager;
    }

}
