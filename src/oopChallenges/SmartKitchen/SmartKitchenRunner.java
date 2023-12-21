package oopChallenges.SmartKitchen;

public class SmartKitchenRunner {
    public static void main(String[] args) {
        // Create instances of the individual appliances
        Refrigerator myFridge = new Refrigerator("Siemens", "super cold plus", 5);
        DishWasher myDishwasher = new DishWasher("Amazon", "4533251", "Eco");
        CoffeMaker myCoffeeMaker = new CoffeMaker("Lavazza", "superbrew");

        // Create an instance of MySmartKitchen with the individual appliances
        MySmartKitchen mySmartKitchen = new MySmartKitchen("KitchenModel", "SmartBrand", myFridge, myDishwasher, myCoffeeMaker);

        // Launch the work to do
        mySmartKitchen.hasWorkToDo();
    }
}
