package main.java.lesson10;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendent {
    public List<WaitingCustomer> customerList;
    public String drink;

    public CoffeeAttendent(){
        this.customerList = new ArrayList<WaitingCustomer>();
        this.drink = "";
    }

    public void takeOrder(WaitingCustomer customer){
        customerList.add(customer);
    }

    public void prepareDrink(String drinkToPrepare){
        this.drink = drinkToPrepare;
        System.out.println("now is prepare drink: " + drinkToPrepare);
    }

    public void callOutCompletedOrder(){
        customerList.remove(customerList.get(customerList.size() - 1));
        System.out.println(drink + " is done!");
    }
}
