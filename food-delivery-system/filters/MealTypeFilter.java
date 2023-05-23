package fooddelsys.filters;

import fooddelsys.data.FoodItem;
import fooddelsys.data.MealType;
import fooddelsys.data.Restaurant;

public class MealTypeFilter implements FoodItemFilter, RestaurantFilter{

    private final MealType mealType;

    public MealTypeFilter(MealType mealType) {
        this.mealType = mealType;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return foodItem.getMealType().equals(mealType);
    }

    @Override
    public boolean filter(Restaurant restaurant) {
        return restaurant.getMealType().equals(mealType);
    }
}
