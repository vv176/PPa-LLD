package ecommerce.commands;

import ecommerce.data.ProductCopy;
import ecommerce.data.User;

import java.util.List;

public class BulkAddProductsCommand implements Command{

    private final User user;
    private final List<ProductCopy> productCopies;

    public BulkAddProductsCommand(User user, List<ProductCopy> productCopies) {
        this.user = user;
        this.productCopies = productCopies;
    }

    @Override
    public void execute() {

    }
}
