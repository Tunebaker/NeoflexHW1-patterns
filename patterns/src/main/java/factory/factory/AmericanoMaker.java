package factory.factory;

import factory.coffee.Americano;
import factory.coffee.Coffee;

public class AmericanoMaker implements CoffeeMaker {
    @Override
    public Coffee makeCoffee() {
        return new Americano();
    }
}
