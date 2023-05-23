package designpatterns.decorator;

public class Mushroom extends Topping{

    public Mushroom(Pizza pizza) {
        super("Mushroom", 4, pizza);
    }

}
