package fooddelsys.apis;

import fooddelsys.data.FoodItem;
import fooddelsys.data.User;
import fooddelsys.managers.CartManager;
import fooddelsys.managers.UserManager;
import fooddelsys.searchers.FoodItemSearcher;

public class AddToCartAPI {

    private final UserManager userManager = new UserManager();
    private final FoodItemSearcher foodItemSearcher = new FoodItemSearcher();
    private final CartManager cartManager = new CartManager();

    public void addToCart(String userToken, int foodItemId) {
        if (userToken == null || userToken.length() == 0 || foodItemId < 0) {
            //
        }
        User user = userManager.getUserByToken(userToken);
        if (user == null) {
            //
        }
        FoodItem foodItem = foodItemSearcher.searchById(foodItemId);
        if (foodItem == null) {

        }
        cartManager.addItemToCart(user, foodItem);
    }

}
