package etc;

import dagger.Module;

import java.util.Date;

@Module
public class TrashModule {
    private static int counter = 0;

    public TrashModule(){
        System.out.println(this.getClass().getName() + ": Empty constructor called " + ++counter + " times on " + new Date());

    }
}
