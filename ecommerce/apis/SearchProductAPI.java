package ecommerce.apis;

import ecommerce.data.FilterDetails;
import ecommerce.data.Product;
import ecommerce.data.User;
import ecommerce.perm.Permission;
import ecommerce.perm.PermisssionFactory;
import ecommerce.searcher.ProductSearcher;

import java.util.List;
import java.util.Optional;

public class SearchProductAPI {

    private final ProductSearcher productSearcher;

    public SearchProductAPI(ProductSearcher productSearcher) {
        this.productSearcher = productSearcher;
    }

    public List<Product> search(String productName, FilterDetails filterDetails,
                                User user) {

        Optional<Permission> permission= PermisssionFactory.getSearchPermission(user);
        if (!permission.isPresent() || !permission.get().isPermitted())
            throw new RuntimeException("Request not allowed");
        return productSearcher.searchProducts(productName, filterDetails);

    }

}
