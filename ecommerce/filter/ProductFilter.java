package ecommerce.filter;

import ecommerce.data.Product;

import java.util.List;

public interface ProductFilter {
    List<Product> filter(List<Product> products);
}
