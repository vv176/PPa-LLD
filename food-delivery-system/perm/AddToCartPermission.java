package fooddelsys.perm;

import fooddelsys.data.FoodItem;
import fooddelsys.data.Restaurant;
import fooddelsys.data.User;
import fooddelsys.managers.DeliveryManager;
import fooddelsys.searchers.RestaurantSearcher;

public class AddToCartPermission implements Permission{

    private final User user;
    private final FoodItem foodItem;
    private final DeliveryManager deliveryManager;

    public AddToCartPermission(User user, FoodItem foodItem) {
        this.user = user;
        this.foodItem = foodItem;
        this.deliveryManager = new DeliveryManager();
    }

    @Override
    public boolean isPermitted() {
        if (!foodItem.isAvailable())
            return false;
        Restaurant restaurant = new RestaurantSearcher().searchById(foodItem.getRestaurantId());
        return deliveryManager.isDeliveryPossible(restaurant.getAddress(), user.getAddress());
    }
}
