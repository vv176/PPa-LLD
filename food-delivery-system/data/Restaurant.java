package fooddelsys.data;

import java.util.List;

public class Restaurant {

    private final int id;
    private final String name;
    private final String description;
    private final BusinessHours businessHours;
    private final  MealType mealType;
    private final List<CuisineType> cuisineTypes;
    private final StarRating rating;
    private final Menu menu;


    private final Address address;

    public Restaurant(int id, String name, String description, BusinessHours businessHours, MealType mealType, List<CuisineType> cuisineTypes, StarRating rating, Menu menu, Address address) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.businessHours = businessHours;
        this.mealType = mealType;
        this.cuisineTypes = cuisineTypes;
        this.rating = rating;
        this.menu = menu;
        this.address = address;
    }

    public Address getAddress() {
        return address;
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

    public BusinessHours getBusinessHours() {
        return businessHours;
    }

    public MealType getMealType() {
        return mealType;
    }

    public List<CuisineType> getCuisineTypes() {
        return cuisineTypes;
    }

    public StarRating getRating() {
        return rating;
    }

    public Menu getMenu() {
        return menu;
    }
}
