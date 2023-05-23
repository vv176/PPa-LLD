package ecommerce.data;

import ecommerce.orders.OrderState;

public class Order {

    private final int id;
    private final Cart cart;

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    private OrderState orderState;

    public int getId() {
        return id;
    }

    public Cart getCart() {
        return cart;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    private final Address shippingAddress;
    private final Address billingAddress;

    public Order(int id, Cart cart, Address shippingAddress, Address billingAddress) {
        this.id = id;
        this.cart = cart;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        //
    }

    public void schedulePickUp(PickUpDetails pickUpDetails) {
        this.orderState.schedulePickUp(pickUpDetails);
    }

    public void cancel() {
        this.orderState.cancel();
    }

    public void pickUp() {
        this.orderState.pickUp();
    }

    public void endTransit(TransitDetails transitDetails) {
        this.orderState.endTransit(transitDetails);
    }

    public OrderStatusDetails getOrderDetails() {
        return this.orderState.getStatus();
    }
}
