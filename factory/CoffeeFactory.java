package designpatterns.factory;

public class CoffeeFactory implements AbstractFactory {

    @Override
    public Coffee getCoffee(String coffeeType) {
        Coffee coffee;
        if (coffeeType.equals("Cappuccino"))
            coffee = new Cappuccino();
        else if (coffeeType.equals("Espresso"))
            coffee = new Espresso();
        else
            coffee = new Robusta();
        return coffee;
    }

}
