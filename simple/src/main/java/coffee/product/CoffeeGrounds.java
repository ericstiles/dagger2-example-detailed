package coffee.product;

import coffee.product.Coffee;

import javax.inject.Inject;
import java.util.Date;

public class CoffeeGrounds implements Coffee {
    private CoffeeBeans coffeeBeans;

    @Inject
    public CoffeeGrounds(){
        System.out.println(this.getClass().getName() + " empty Constructor: Store bought grounds, " + new Date());
    }


    public CoffeeGrounds(CoffeeBeans coffeeBeans) {
        System.out.println(this.getClass().getName() + " custom ground from " + this.getClass().getName() + ", " + new Date());
        this.coffeeBeans = coffeeBeans;
    }

    @Override
    public String getType() {
        return this.getClass().getName() + (coffeeBeans == null ? " are store bought" : " ground from " + coffeeBeans.getClass().getName());
    }

    public CoffeeGrounds setCoffeeBeans (CoffeeBeans coffeeBeans){
        this.coffeeBeans = coffeeBeans;
        return this;
    }
}