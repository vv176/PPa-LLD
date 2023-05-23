package designpatterns.decorator;

import java.io.BufferedReader;
import java.io.FileReader;

public class Tester {

    public static void main(String[] args) {

        Pizza pizza = new Mushroom(new Olive(new Onion(new WheatBase())));
        System.out.println(pizza.getName() + " " + pizza.getCost());

    }

}



