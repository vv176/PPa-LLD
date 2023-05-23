package designpatterns.factory2;


public class Robusta extends Coffee {
    public Robusta(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void brew() {

    }

    @Override
    public void boil() {

    }
}
