package ecommerce.apis;

import ecommerce.data.ProductCopy;
import ecommerce.data.User;
import ecommerce.db.DBAccessor;
import ecommerce.manager.CartManager;
import ecommerce.perm.Permission;
import ecommerce.perm.PermisssionFactory;

import java.util.Optional;

public class AddToCartAPI {

    private final CartManager cartManager;

    public AddToCartAPI(CartManager cartManager) {
        this.cartManager = cartManager;
    }

    public void addToCart(int productId, User user) {

        ProductCopy productCopy = DBAccessor.getProductCopyId(productId);
        if (productCopy == null)
            throw new IllegalArgumentException("Invalid prod id");
        Optional<Permission> permission = PermisssionFactory
                .getAddToCartPermission(user, productCopy);
        if (!permission.isPresent() || !permission.get().isPermitted())
            throw new RuntimeException("Action not allowed");
        this.cartManager.addToCart(user, productCopy);
    }


}
