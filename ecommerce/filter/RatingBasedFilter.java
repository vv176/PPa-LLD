package ecommerce.filter;

import ecommerce.data.Product;
import ecommerce.data.Rating;

import java.util.ArrayList;
import java.util.List;

public class RatingBasedFilter implements ProductFilter{
    private final Rating minRating;
    private final ProductFilter nextFilter;

    public RatingBasedFilter(Rating minRating, ProductFilter nextFilter) {
        this.minRating = minRating;
        this.nextFilter = nextFilter;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> filteredProducts = nextFilter.filter(products);
        List<Product> finalProducts = new ArrayList<>();
        for (Product product : filteredProducts) {
            if (product.getRating().getVal() >= minRating.getVal())
                finalProducts.add(product);
        }
        return finalProducts;
    }
}
