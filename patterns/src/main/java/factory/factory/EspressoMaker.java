package factory.factory;

import factory.coffee.Coffee;
import factory.coffee.Espresso;

public class EspressoMaker implements CoffeeMaker {
    @Override
    public Coffee makeCoffee() {
        return new Espresso();
    }
}
