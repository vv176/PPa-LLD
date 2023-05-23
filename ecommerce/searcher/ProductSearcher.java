package ecommerce.searcher;

import ecommerce.data.FilterDetails;
import ecommerce.data.Product;
import ecommerce.db.DBAccessor;
import ecommerce.filter.FilterFactory;

import java.util.List;

public class ProductSearcher {

    public List<Product> searchProducts(String productName,
                                        FilterDetails filterDetails) {
        List<Product> products = DBAccessor
                .getProductsByName(productName);
        return FilterFactory.getProductFilter(filterDetails)
                .filter(products);
    }

}
