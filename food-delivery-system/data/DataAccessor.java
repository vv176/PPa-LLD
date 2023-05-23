package fooddelsys.data;

import java.util.List;

public class DataAccessor {

    private DataAccessor() {}

    public static void addItemToCart(User user, FoodItem foodItem) {

    }

    public static DataAccessResult getFoodItemsWithName(String name) {
        return null;
    }

    public static DataAccessResult getCart(User user) {return null;}

    public static void deleteItemFromCart(User user, FoodItem foodItem) {}

    public static void checkOutCart(User user) {}

    public static int createOrder(User user, List<CartItem> cartItems) {
        return 1;
    }

}
