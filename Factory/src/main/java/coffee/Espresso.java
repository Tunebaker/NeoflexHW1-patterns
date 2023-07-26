package coffee;

import coffee.Coffee;

public class Espresso implements Coffee {
    @Override
    public void getCupOfCoffee() {
        System.out.println("take your espresso");
    }
}
