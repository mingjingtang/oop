package main.java.lesson10;

public class Customer implements WaitingCustomer {
    private String name;
    public String drinkOrdered;

    @Override
    public boolean orderReady(String preparedDrink) {
        this.drinkOrdered = preparedDrink;
        return true;
    }

    public void setDrinkOrdered(String drinkOrdered) {
        this.drinkOrdered = drinkOrdered;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrinkOrdered() {
        return drinkOrdered;
    }
}
