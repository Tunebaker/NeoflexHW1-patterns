package factory;

import coffee.Americano;
import coffee.Coffee;

public class AmericanoMaker implements CoffeeMaker {
    @Override
    public Coffee makeCoffee() {
        return new Americano();
    }
}
