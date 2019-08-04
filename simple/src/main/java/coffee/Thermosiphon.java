package coffee;

import javax.inject.Inject;
import java.util.Date;

class Thermosiphon implements Pump {
  private final Heater heater;
  private static int counter;

  @Inject
  Thermosiphon(Heater heater) {
    System.out.println(this.getClass().getName() + ": Constructor called needing a heater (" + heater.getClass().getName() + ") " + ++counter + " times on " + new Date());
    this.heater = heater;
  }

  @Override public void pump() {
    if (heater.isHot()) {
      System.out.println("=> => pumping => =>");
    }
  }
}
