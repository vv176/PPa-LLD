package ecommerce.perm;

import ecommerce.data.Order;
import ecommerce.data.ProductCopy;
import ecommerce.data.User;

import java.util.Optional;

public class PermisssionFactory {

    private PermisssionFactory(){}

    public static Optional<Permission> getSearchPermission(User user) {
        // query DB
        // construct and return permission
        return Optional.of(new SearchProductPermission(user));
    }

    public static Optional<Permission> getAddToCartPermission(User user,
                                                              ProductCopy productCopy) {
        // query DB
        // construct and return permission
        return Optional.of(new AddToCartPermission(user, productCopy));
    }

    public static Optional<Permission> getTrackOrderPermission(User user, Order order) {
        return Optional.of(new TrackOrderPermission(order, user));
    }

}
