package ecommerce.filter;

import ecommerce.data.FilterDetails;

public class FilterFactory {
    private FilterFactory(){}

    public static ProductFilter getProductFilter(
            FilterDetails filterDetails) {
        ProductFilter filter = new IdleFilter();
        if (filterDetails.getRatingFilter().isPresent()) {
            filter = new RatingBasedFilter(filterDetails.getRatingFilter().get(),
                    filter);
        }
        if (filterDetails.getPayOnDelFilter().isPresent()) {
            filter = new PayOnDelFilter(filterDetails.getPayOnDelFilter().get(),
                    filter);
        }
        if (filterDetails.getPriceFilter().isPresent()) {
            filter = new PriceBasedFilter(filterDetails.getPriceFilter().get(),
                    filter);
        }
        return filter;
    }
}
