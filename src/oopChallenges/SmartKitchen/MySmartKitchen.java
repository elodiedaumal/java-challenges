package oopChallenges.SmartKitchen;

public class MySmartKitchen extends Appliances{

    private Refrigerator refrigerator;
    private DishWasher dishwasher;
    private CoffeMaker coffeeMaker;


    public MySmartKitchen(String model, String brand, Refrigerator refrigerator, DishWasher dishwasher, CoffeMaker coffeeMaker) {
        super(model, brand);
        this.refrigerator = refrigerator;
        this.dishwasher = dishwasher;
        this.coffeeMaker = coffeeMaker;
    }
    public void hasWorkToDo() {
        refrigerator.orderFood();
        dishwasher.doDishes("eco");
        coffeeMaker.brewCoffee();
    }
}
