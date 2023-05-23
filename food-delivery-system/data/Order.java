package fooddelsys.data;

import java.util.List;

public class Order {

    private final List<CartItem> cartItems;
    private final int orderId;
    private final int userId;
    private final OrderStatus orderStatus;

    public Order(List<CartItem> cartItems, int orderId, int userId, OrderStatus orderStatus) {
        this.cartItems = cartItems;
        this.orderId = orderId;
        this.userId = userId;
        this.orderStatus = orderStatus;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
