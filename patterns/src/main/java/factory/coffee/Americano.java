package factory.coffee;

public class Americano implements Coffee {
    @Override
    public void getCupOfCoffee() {
        System.out.println("take your americano");
    }
}
