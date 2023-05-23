package fooddelsys.data;

public class FoodItem {


    // Builder Pattern
    private final int id;
    private final String name;
    private final String description;
    private final double priceINR;
    private final MealType mealType;
    private final CuisineType cuisineType;
    private final StarRating starRating;
    private final int restaurantId;
    private final boolean isAvailable;


    public FoodItem(int id, String name, String description, double priceINR, MealType mealType, CuisineType cuisineType, StarRating starRating, int restaurantId, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priceINR = priceINR;
        this.mealType = mealType;
        this.cuisineType = cuisineType;
        this.starRating = starRating;
        this.restaurantId = restaurantId;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPriceINR() {
        return priceINR;
    }

    public MealType getMealType() {
        return mealType;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public StarRating getStarRating() {
        return starRating;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


}
