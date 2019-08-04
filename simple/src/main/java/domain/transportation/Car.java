package domain.transportation;

//import lombok.Data;
import domain.transportation.company.Brand;
import domain.transportation.components.Engine;

import javax.inject.Inject;

//@Data
public class Car extends Vehicle {

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private Engine engine;
    private Brand brand;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Inject
    public Car(Engine engine, Brand brand) {
        this.engine = engine;
        this.brand = brand;
    }


}
