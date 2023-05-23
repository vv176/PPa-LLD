package designpatterns.factory2;

public abstract class Coffee {

    private final Bean bean;
    private final Sugar sugar;
    private final Milk milk;
    private final IngredientFactory ingredientFactory;

    protected Coffee(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.bean = ingredientFactory.getBean();
        this.sugar = ingredientFactory.getSugar();
        this.milk = ingredientFactory.getMilk();
    }

    abstract void brew();

    abstract void boil();

}
