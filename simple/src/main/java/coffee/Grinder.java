package coffee;

import coffee.product.CoffeeBeans;
import coffee.product.CoffeeGrounds;
import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;
import java.util.Date;

@Module
public class Grinder {

    private final Electricity electricity;

    public Grinder(){
        System.out.println("coffee.Grinder empty constructor called:" + new Date());
        System.out.println("Creating a new Electricity object and setting.");
        this.electricity = new Electricity();

    }

    @Inject public Grinder (Electricity electricity){
        this.electricity = electricity;
        System.out.println("Grinder constructor with Electricity:" + electricity);
    }

    @Provides
    CoffeeGrounds grind(CoffeeBeans coffeeBeans){
        System.out.println("* * * grinding * * *");
        return new CoffeeGrounds(coffeeBeans);
    }
}
