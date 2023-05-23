package fooddelsys.filters;

import fooddelsys.data.FoodItem;
import fooddelsys.data.Restaurant;
import fooddelsys.data.StarRating;

public class StarRatingFilter implements FoodItemFilter, RestaurantFilter{

    private final StarRating rating;

    public StarRatingFilter(StarRating rating) {
        this.rating = rating;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return foodItem.getStarRating().getVal() >= rating.getVal();
    }

    @Override
    public boolean filter(Restaurant restaurant) {
        return restaurant.getRating().getVal() >= rating.getVal();
    }
}
