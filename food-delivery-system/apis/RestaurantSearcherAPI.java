package fooddelsys.apis;

import fooddelsys.data.CuisineType;
import fooddelsys.data.MealType;
import fooddelsys.data.Restaurant;
import fooddelsys.data.StarRating;
import fooddelsys.filters.CuisinesTypeFilter;
import fooddelsys.filters.MealTypeFilter;
import fooddelsys.filters.RestaurantFilter;
import fooddelsys.filters.StarRatingFilter;
import fooddelsys.searchers.RestaurantSearcher;

import java.util.ArrayList;
import java.util.List;

public class RestaurantSearcherAPI {

    public List<Restaurant> searchRestaurant(String restaurantName, MealType mealType, List<CuisineType> cuisineTypes, StarRating rating) {
        // validations
        List<RestaurantFilter> filters = new ArrayList<>();
        if (mealType != null)
            filters.add(new MealTypeFilter(mealType));
        if (cuisineTypes != null)
            filters.add(new CuisinesTypeFilter((cuisineTypes)));
        if (rating != null)
            filters.add(new StarRatingFilter(rating));
        return new RestaurantSearcher().search(restaurantName, filters);
    }

}
