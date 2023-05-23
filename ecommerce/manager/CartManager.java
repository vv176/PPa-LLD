package ecommerce.manager;

import ecommerce.data.Cart;
import ecommerce.data.Order;
import ecommerce.data.ProductCopy;
import ecommerce.data.User;
import ecommerce.db.DBAccessor;

public class CartManager {

    public Cart getCart(User user) {
        return DBAccessor.getCart(user);
    }

    public void addToCart(User user, ProductCopy productCopy) {
        if (productCopy.isSold())
            throw new RuntimeException("cannot add to cart");
        Cart cart = getCart(user);
        cart.add(productCopy);
        DBAccessor.persistCart(cart, user);
    }

    public void removeFromCart(User user, ProductCopy productCopy) {
        Cart cart = getCart(user);
        cart.remove(productCopy);
        DBAccessor.persistCart(cart, user);
    }

    public void checkOutCart(User user, Order order) {
        DBAccessor.checkOutCart(user, order);
    }

}
