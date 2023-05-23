package fooddelsys.perm;

import fooddelsys.data.FoodItem;
import fooddelsys.data.User;

public class DeleteFromCartPermission implements Permission{

    private final User user;
    private final FoodItem foodItem;

    public DeleteFromCartPermission(User user, FoodItem foodItem) {
        this.user = user;
        this.foodItem = foodItem;
    }

    @Override
    public boolean isPermitted() {
        return false;
    }
}
