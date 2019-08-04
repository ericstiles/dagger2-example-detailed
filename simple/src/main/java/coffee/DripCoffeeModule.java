package coffee;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import java.util.Date;

@Module(includes = PumpModule.class)
class DripCoffeeModule {

  private static int counter,counterMethod = 0;

  public DripCoffeeModule(){
    System.out.println(this.getClass().getName() + ": Empty constructor called " + ++counter + " times on " + new Date());

  }

  @Provides @Singleton Heater provideHeater() {
    ElectricHeater eh = new ElectricHeater();
    System.out.println(this.getClass().getName() + ": provideHeater method called " + ++counterMethod + " times returning :" + eh.getClass().getName());
    return eh;
  }
}
