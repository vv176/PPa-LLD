package ecommerce.data;


import java.util.Optional;

public class FilterDetails {


    private final Optional<Double> priceFilter;
    private final Optional<Rating> ratingFilter;
    private final Optional<Boolean> payOnDelFilter;

    public FilterDetails(Optional<Double> priceFilter,
                         Optional<Rating> ratingFilter,
                         Optional<Boolean> payOnDelFilter) {
        this.priceFilter = priceFilter;
        this.ratingFilter = ratingFilter;
        this.payOnDelFilter = payOnDelFilter;
    }

    public Optional<Double> getPriceFilter() {
        return priceFilter;
    }

    public Optional<Rating> getRatingFilter() {
        return ratingFilter;
    }

    public Optional<Boolean> getPayOnDelFilter() {
        return payOnDelFilter;
    }
}
