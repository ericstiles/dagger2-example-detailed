package coffee.product;

import javax.inject.Inject;
import java.util.Date;

public class CoffeeBeans implements Coffee {

    @Inject
    public CoffeeBeans(){
        System.out.println("coffee.product.CoffeeBeans empty constructor called using @Inject, " + new Date());
    }

    @Override
    public String getType() {
        return this.getClass().getName();
    }
}
