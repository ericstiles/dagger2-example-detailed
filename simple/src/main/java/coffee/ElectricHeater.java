package coffee;

import java.util.Date;

class ElectricHeater implements Heater {
  boolean heating;

  private static int counter = 0;

  public ElectricHeater(){
    System.out.println(this.getClass().getName() + ": Empty constructor called " + ++counter + " times on " + new Date());
  }

  @Override public void on() {
    System.out.println("~ ~ ~ heating ~ ~ ~:" + counter);
    this.heating = true;
  }

  @Override public void off() {
    this.heating = false;
  }

  @Override public boolean isHot() {
    return heating;
  }

}
