package main.java.lesson10;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeAttendent ca = new CoffeeAttendent();

        Customer jane = new Customer();
        jane.setDrinkOrdered("matcha");
        jane.setName("jane");

        Customer michael = new Customer();
        michael.setDrinkOrdered("cold brew");
        michael.setName("michael");


        ca.takeOrder(jane);
        ca.prepareDrink(jane.getDrinkOrdered());
        ca.callOutCompletedOrder();

        ca.takeOrder(michael);
        ca.prepareDrink(michael.getDrinkOrdered());
        ca.callOutCompletedOrder();
    }
}
