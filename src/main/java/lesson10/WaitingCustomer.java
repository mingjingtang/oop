package main.java.lesson10;

public interface WaitingCustomer {
    public String getName();
    public String getDrinkOrdered();
    public void orderReady(String completedDrink);
}
