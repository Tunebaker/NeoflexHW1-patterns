package factory;

import coffee.Coffee;
import coffee.Espresso;

public class EspressoMaker implements CoffeeMaker {
    @Override
    public Coffee makeCoffee() {
        return new Espresso();
    }
}
