package ecommerce.orders;

import ecommerce.data.DeliveryDetails;
import ecommerce.data.OrderStatusDetails;
import ecommerce.data.PickUpDetails;
import ecommerce.data.TransitDetails;

public class PickUpScheduledState implements OrderState{
    @Override
    public void schedulePickUp(PickUpDetails pickUpDetails) {

    }

    @Override
    public void pickUp() {

    }

    @Override
    public void endTransit(TransitDetails transitDetails) {

    }

    @Override
    public void scheduleDelivery(DeliveryDetails deliveryDetails) {

    }

    @Override
    public void deliver() {

    }

    @Override
    public void cancel() {

    }

    @Override
    public OrderStatusDetails getStatus() {
        return null;
    }
}
