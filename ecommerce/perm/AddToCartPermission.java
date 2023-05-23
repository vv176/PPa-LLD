package ecommerce.perm;

import ecommerce.data.Cart;
import ecommerce.data.ProductCopy;
import ecommerce.data.User;
import ecommerce.db.DBAccessor;

public class AddToCartPermission implements Permission{

    private static final double MAX_CART_AMOUNT = 1000000;
    private static final int DISTNICT_ITEMS_LIMT = 50;
    private static final int TOTAL_ITEMS_LIMT = 1000;

    private final User user;
    private final ProductCopy productCopy;

    public AddToCartPermission(User user, ProductCopy productCopy) {
        this.user = user;
        this.productCopy = productCopy;
    }

    @Override
    public boolean isPermitted() {
        Cart cart = DBAccessor.getCart(user);
        if (cart.getCartAmount() > MAX_CART_AMOUNT ||
        cart.getDistinctItemsCount() > DISTNICT_ITEMS_LIMT ||
                cart.getTotalItemsCount() > TOTAL_ITEMS_LIMT
        )
            return false;
        return true;
    }
}
