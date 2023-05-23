package designpatterns.decorator;

public class Onion extends Topping{

    public Onion(Pizza pizza) {
        super("Onion", 4, pizza);
    }

}
