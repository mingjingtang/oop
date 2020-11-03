package main.java.lesson10;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeAttendent ca = new CoffeeAttendent();

        Customer jane = new Customer("jane", "matcha");
        Customer michael = new Customer("michael", "cold brew");

        ca.takeOrder(jane);
        ca.takeOrder(michael);

        //prepare drink
        ca.prepareDrink("matcha");
        ca.prepareDrink("cold brew");

        //order up
        ca.callOutCompletedOrder();
    }
}
