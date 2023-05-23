package ecommerce.data;

public class OrderStatusDetails {
    private final OrderStatus orderStatus;

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public String getDescription() {
        return description;
    }

    private final String description;

    public OrderStatusDetails(String description, OrderStatus orderStatus) {
        this.description = description;
        this.orderStatus = orderStatus;
    }
}
