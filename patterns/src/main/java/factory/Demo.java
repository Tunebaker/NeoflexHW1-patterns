package factory;

import factory.coffee.Coffee;
import factory.coffee.CoffeeType;
import factory.factory.AmericanoMaker;
import factory.factory.CoffeeMaker;
import factory.factory.EspressoMaker;

public class Demo {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = getCoffeeMaker(CoffeeType.ESPRESSO);
        Coffee coffee = coffeeMaker.makeCoffee();
        coffee.getCupOfCoffee();
    }

    public static CoffeeMaker getCoffeeMaker(CoffeeType coffeeType){

            if(coffeeType == CoffeeType.AMERICANO){
                return new AmericanoMaker();
            }
            if(coffeeType == CoffeeType.ESPRESSO){
                return new EspressoMaker();
            }
            else throw new IllegalArgumentException(coffeeType + " is illegal type");
    }
}
