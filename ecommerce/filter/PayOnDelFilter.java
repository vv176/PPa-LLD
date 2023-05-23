package ecommerce.filter;

import ecommerce.data.Product;

import java.util.ArrayList;
import java.util.List;

public class PayOnDelFilter implements ProductFilter{

    private final boolean isPayOnDelivery;

    private final ProductFilter nextFilter;

    public PayOnDelFilter(boolean isPayOnDelivery, ProductFilter nextFilter) {
        this.isPayOnDelivery = isPayOnDelivery;
        this.nextFilter = nextFilter;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> filteredProducts = nextFilter.filter(products);
        List<Product> finalProducts = new ArrayList<>();
        for (Product product : filteredProducts) {
            if (product.isPayOnDelivery() == isPayOnDelivery)
                finalProducts.add(product);
        }
        return finalProducts;
    }
}
