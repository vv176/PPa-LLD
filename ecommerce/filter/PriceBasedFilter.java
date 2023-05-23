package ecommerce.filter;

import ecommerce.data.Product;

import java.util.ArrayList;
import java.util.List;

public class PriceBasedFilter implements ProductFilter{
    private final double priceUpperCap;
    private final ProductFilter nextFilter;

    public PriceBasedFilter(double priceUpperCap, ProductFilter nextFilter) {
        this.priceUpperCap = priceUpperCap;
        this.nextFilter = nextFilter;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> filteredProducts = nextFilter.filter(products);
        List<Product> finalProducts = new ArrayList<>();
        for (Product product : filteredProducts) {
            if (product.getPriceInINR() <= priceUpperCap)
                finalProducts.add(product);
        }
        return finalProducts;
    }
}
