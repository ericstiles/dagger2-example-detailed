package coffee;

import coffee.meta.Brand;
import dagger.Component;
import etc.TrashModule;
import domain.tea.DripTeaModule;
import domain.tea.TeaMaker;

import javax.inject.Singleton;
import java.util.Date;

public class CoffeeApp {
  @Singleton
  @Component(modules = { Grinder.class, DripCoffeeModule.class, DripTeaModule.class, TrashModule.class, Brand.class})
  public interface CoffeeShop {
    CoffeeMaker initiateCoffeeMaker();
    TeaMaker initiateTeaMaker();

  }

  public static void main(String[] args) {
    System.out.println("Entering coffee.CoffeeShop.main() method: " + new Date());
    System.out.println("DaggerCoffeeApp_CoffeeShop.builder().build() method getting ready to be called");
    CoffeeShop coffeeShop = DaggerCoffeeApp_CoffeeShop.builder().build();
    System.out.println(coffeeShop.getClass().getName() + ".builder() method called");

    CoffeeMaker coffeeMaker = coffeeShop.initiateCoffeeMaker();
    System.out.println(coffeeMaker.getClass().getName() + " instantiated.  Getting ready to brew()");

    System.out.println(coffeeMaker.getClass().getName() + " getting ready to call brew() method.");
    coffeeMaker.brew();

    System.out.println("");
    System.out.println("Drinking coffee.  Doh empty");
    System.out.println(coffeeMaker.getClass().getName() + " already instantiated.  Getting ready to brew()");
    coffeeMaker.brew();

    System.out.println("");
    System.out.println("CoffeeMaker broke.  Need to create a new one.");
    coffeeMaker = coffeeShop.initiateCoffeeMaker();
    System.out.println(coffeeMaker.getClass().getName() + " instantiated.  Getting ready to brew()");
    coffeeMaker.brew();

    System.out.println("--------------------------------------------");
    System.out.println("-                                          -");
    System.out.println("- Success!!! - Starting Another CoffeeShop -");
    System.out.println("-                                          -");
    System.out.println("--------------------------------------------");

    System.out.println("Building a new CoffeeShop in main method: " + new Date());
    coffeeShop = DaggerCoffeeApp_CoffeeShop.builder().build();
    System.out.println(coffeeShop.getClass().getName() + ".builder() method called");
    coffeeMaker = coffeeShop.initiateCoffeeMaker();
    System.out.println(coffeeMaker.getClass().getName() + " instantiated.  Getting ready to brew()");
    coffeeMaker.brew();

    System.out.println("");
    System.out.println("Drinking coffee.  Doh empty");
    System.out.println(coffeeMaker.getClass().getName() + " already instantiated.  Getting ready to brew()");
    coffeeMaker.brew();

    System.out.println("");
    System.out.println("CoffeeMaker broke.  Need to create a new one.");
    coffeeMaker = coffeeShop.initiateCoffeeMaker();
    System.out.println(coffeeMaker.getClass().getName() + " instantiated.  Getting ready to brew()");
    coffeeMaker.brew();
  }
}
