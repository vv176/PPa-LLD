package ecommerce.data;

public class ProductCopy {

    private final Product product;
    private final int id;

    public Product getProduct() {
        return product;
    }

    public int getId() {
        return id;
    }

    public boolean isSold() {
        return isSold;
    }

    private final boolean isSold;

    public ProductCopy(Product product, int id, boolean isSold) {
        this.product = product;
        this.id = id;
        this.isSold = isSold;
    }
}
