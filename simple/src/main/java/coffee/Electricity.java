package coffee;

import javax.inject.Inject;
import java.util.Date;

public class Electricity {
    @Inject
     public Electricity(){
        System.out.println("Electricity empty constructor: Power cord plugged in:" + new Date());
    }




}
