package ecommerce.perm;

import ecommerce.data.Order;
import ecommerce.data.User;

public class TrackOrderPermission implements Permission{

    private final Order order;
    private final User user;

    public TrackOrderPermission(Order order, User user) {
        this.order = order;
        this.user = user;
    }

    @Override
    public boolean isPermitted() {
        return false;
    }
}
