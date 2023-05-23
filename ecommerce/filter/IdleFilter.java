package ecommerce.filter;

import ecommerce.data.Product;

import java.util.List;

public class IdleFilter implements ProductFilter{
    @Override
    public List<Product> filter(List<Product> products) {
        return products;
    }
}
