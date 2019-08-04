package domain.transportation;

public class AutoShop {

    public static void main (String [] args){




        VehiclesComponent component = DaggerVehiclesComponent.create();

        Car carOne = component.buildCar();
        Car carTwo = component.buildCar();

        System.out.println(carOne.getEngine());
        System.out.println(carTwo.getEngine());
        System.out.println(carOne.getBrand());
        System.out.println(carTwo.getBrand());
//        Assert.assertNotNull(carOne);
//        Assert.assertNotNull(carTwo);
//        Assert.assertNotNull(carOne.getEngine());
//        Assert.assertNotNull(carTwo.getEngine());
//        Assert.assertNotNull(carOne.getBrand());
//        Assert.assertNotNull(carTwo.getBrand());
//        Assert.assertNotEquals(carOne.getEngine(), carTwo.getEngine());
//        Assert.assertEquals(carOne.getBrand(), carTwo.getBrand());
    }}