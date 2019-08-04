package domain.tea;

import dagger.Module;

import java.util.Date;

@Module
public class DripTeaModule {
    private static int counter = 0;

    public DripTeaModule(){
        System.out.println(this.getClass().getName() + ": Empty constructor called " + ++counter + " times on " + new Date());

    }
}
