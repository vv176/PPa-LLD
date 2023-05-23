package fooddelsys.managers;

import fooddelsys.data.*;
import fooddelsys.factory.PermissionFactory;
import fooddelsys.perm.Permission;

import java.util.List;

public class CartManager {

    public List<CartItem> getUserCart(User user) {
        DataAccessResult dataAccessResult = DataAccessor.getCart(user);
        return DataAccessObjectConverter.convertToCartItems(dataAccessResult);
    }

    // adds 1 unit
    public void addItemToCart(User user, FoodItem foodItem) {
        Permission permission = PermissionFactory.getAddToCartPermission(user, foodItem);
        if (!permission.isPermitted())
            throw new RuntimeException("Permission Denied");
        if (!isFoodItemFromSameRestaurant(user, foodItem))
            throw new RuntimeException("Your cart contains items from diff restaurant");
        DataAccessor.addItemToCart(user, foodItem);
    }

    public void deleteItemFromCart(User user, FoodItem foodItem) {
        Permission permission = PermissionFactory.getDeleteFromCartPermission(user, foodItem);
        if (!permission.isPermitted())
            throw new RuntimeException("Permission Denied");
        if (!isFoodItemPresentInCart(user, foodItem))
            throw new RuntimeException("foodItem not in cart");
        DataAccessor.deleteItemFromCart(user, foodItem);
    }

    public void checkOutUserCart(User user) {
        Permission permission = PermissionFactory.getCheckoutCartPermission(user);
        if (!permission.isPermitted())
            throw new RuntimeException("Permission Denied");
        if (isCartEmpty(user))
            throw new RuntimeException("Cart empty");
        DataAccessor.checkOutCart(user);
    }

    private boolean isFoodItemFromSameRestaurant(User user, FoodItem foodItem) {
        List<CartItem> cartItems = getUserCart(user);
         return cartItems.isEmpty() || (cartItems.get(0).getFoodItem().getRestaurantId() == foodItem.getRestaurantId());
    }

    private boolean isFoodItemPresentInCart(User user, FoodItem foodItem) {
        List<CartItem> cartItems = getUserCart(user);
        for (CartItem item : cartItems) {
            if (item.getFoodItem().getId() == foodItem.getId())
                return true;
        }
        return false;
    }

    private boolean isCartEmpty(User user) {
        List<CartItem> cartItems = getUserCart(user);
        return cartItems.isEmpty();
    }


}
