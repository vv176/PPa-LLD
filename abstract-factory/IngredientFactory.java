package designpatterns.factory2;


public interface IngredientFactory {

    Bean getBean();

    Sugar getSugar();

    Milk getMilk();

}
