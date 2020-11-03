package main.java.lesson10;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendent {
    public List<Customer> customerList;
    public List<String> drinks;

    public CoffeeAttendent(){
        this.customerList = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    public void takeOrder(Customer customer){
        customerList.add(customer);
        System.out.println("Coffee Attendent: '" + customer.getName()
                + ", I've started working on your order of "
                + customer.getDrinkOrdered() + "'");
    }

    public void prepareDrink(String drinkToPrepare){
        double timeTaken = Math.random()* 10; // give value between 1 and 50
        try {
            Thread.sleep((long) (timeTaken)*1000);
            drinks.add(drinkToPrepare);
        } catch (InterruptedException e) {
            System.out.println(" for some reason, drink was not prepared..");
        }
    }

    public void callOutCompletedOrder(){
        for (String readyedDrink : drinks) {
            System.out.println("Order up: " + readyedDrink);
            for (Customer customer : customerList) {
                customer.orderReady(readyedDrink);
            }
        }
    }
}
