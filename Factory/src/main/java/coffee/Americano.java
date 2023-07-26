package coffee;

import coffee.Coffee;

public class Americano implements Coffee {
    @Override
    public void getCupOfCoffee() {
        System.out.println("take your americano");
    }
}
