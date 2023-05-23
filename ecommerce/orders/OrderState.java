package ecommerce.orders;

import ecommerce.data.DeliveryDetails;
import ecommerce.data.OrderStatusDetails;
import ecommerce.data.PickUpDetails;
import ecommerce.data.TransitDetails;

public interface OrderState {

    void schedulePickUp(PickUpDetails pickUpDetails);
    void pickUp();
    void endTransit(TransitDetails transitDetails);
    void scheduleDelivery(DeliveryDetails deliveryDetails);
    void deliver();
    void cancel();
    OrderStatusDetails getStatus();

}
