package designpatterns.decorator;

public abstract class Topping extends Pizza {

    private final Pizza pizza;

    public Topping(String name, double cost, Pizza pizza) {
        super(name, cost);
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return super.getName() + " " + pizza.getName();
    }

    @Override
    public double getCost() {
        return super.getCost() + pizza.getCost();
    }
}

