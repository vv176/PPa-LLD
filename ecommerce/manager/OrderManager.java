package ecommerce.manager;

import ecommerce.data.Address;
import ecommerce.data.Cart;
import ecommerce.data.Order;
import ecommerce.data.User;
import ecommerce.payments.PaymentProcessor;

public class OrderManager {

    private final CartManager cartManager;

    public OrderManager(CartManager cartManager) {
        this.cartManager = cartManager;
    }

    public Order placeOrder(User user, PaymentProcessor paymentProcessor,
                            Address shippingAddress,
                            Address billingAddress) {
        Cart cart = cartManager.getCart(user);
        if (cart.getCartAmount() != paymentProcessor.getPayableAmount())
            throw new RuntimeException("Invalid amt");
        if (!paymentProcessor.processPayment())
            throw new RuntimeException("payment failed");
        Order order = new Order(getOrderId(),
                cart, shippingAddress, billingAddress);
         cartManager.checkOutCart(user, order);
         return order;
    }

    private int getOrderId() {return 0;}

}
