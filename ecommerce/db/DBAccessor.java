package ecommerce.db;

import ecommerce.data.*;

import java.util.List;

public class DBAccessor {

    private DBAccessor(){}

    public static List<Product> getProductsByName(String productName) {
        return null;
    }

    public static ProductCopy getProductCopyId(int productId) {return null;}

    public static Cart getCart(User user)  {return null;}

    public static void persistCart(Cart cart, User user) {}

    public static void checkOutCart(User user, Order order){}
    public static Order getOrderById(int id) {return null;}

}
