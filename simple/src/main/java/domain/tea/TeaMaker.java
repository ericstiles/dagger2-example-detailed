package domain.tea;

import javax.inject.Inject;
import java.util.Date;

public class TeaMaker {
    private static int counter = 0;

    @Inject
    public TeaMaker(){
        System.out.println(this.getClass().getName() + ": Empty constructor called " + ++counter + " times on " + new Date());
    }
}
