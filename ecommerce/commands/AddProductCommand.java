package ecommerce.commands;

import ecommerce.data.ProductCopy;
import ecommerce.data.User;

public class AddProductCommand implements Command{

    private final User user;
    private final ProductCopy productCopy;

    public AddProductCommand(User user, ProductCopy productCopy) {
        this.user = user;
        this.productCopy = productCopy;
    }

    @Override
    public void execute() {

    }
}
