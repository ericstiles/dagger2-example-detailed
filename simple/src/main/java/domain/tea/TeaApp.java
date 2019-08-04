package domain.tea;


//import coffee.CoffeeMaker;
//import coffee.DripCoffeeModule;

public class TeaApp {

    public static void main(String[] args) {
        TeaApp teaApp = new TeaApp();
        System.out.println("----------------");
        System.out.println(teaApp.getClass().getName());
        Teavana t = DaggerTeavana.builder().build();
        t.maker();
//        coffee.CoffeeApp.CoffeeShop coffeeShop = DaggerCoffeeApp_CoffeeShop.builder().build();
//        coffeeShop.makeCoffeeMaker().brew();
    }
}