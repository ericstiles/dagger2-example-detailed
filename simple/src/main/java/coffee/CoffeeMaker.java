package coffee;

import coffee.product.Coffee;
import coffee.product.CoffeeGrounds;
import dagger.Lazy;
import javax.inject.Inject;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

class CoffeeMaker {
  private final Lazy<Heater> heater; // Create a possibly costly heater only when we use it.
  private final Pump pump;
  private static int counter = 0;
  private static Set set = new HashSet();
  private final Coffee grounds;
  private final Grinder grinder;

  @Inject CoffeeMaker(Lazy<Heater> heater, Pump pump, CoffeeGrounds grounds, Grinder grinder) {
    System.out.println(this.getClass().getName() + ": Empty constructor called " + ++counter + " times on " + new Date());
//    System.out.println(++counter + ":CoffeeMaker constructed:" + new Date());
    System.out.println("Injecting Heater:" + heater);
    set.add(heater);
    this.heater = heater;

    System.out.println("Injecting pump:" + pump);
    set.add(pump);
    this.pump = pump;
    System.out.println("Getting coffee:" + grounds);
    System.out.println("In CoffeeMaker.  Getting coffeed type:" + grounds.getType());

    this.grinder = grinder;


    set.add(grounds);
    this.grounds = grounds;
    System.out.println("Below is all my heater and pump over the CoffeeShop Lifetime:");
    System.out.println("    " + set);
  }

  public void brew() {
    System.out.println(this.getClass().getName() + ".brew() called on " + new Date());
    heater.get().on();
    pump.pump();
    System.out.println(" [_]P coffee! [_]P ");
    heater.get().off();
  }
}
