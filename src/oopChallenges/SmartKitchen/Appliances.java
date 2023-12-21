package oopChallenges.SmartKitchen;

public class Appliances {
    private String model;
    private String brand;


    public Appliances(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
}
    class Refrigerator extends Appliances {
        private int temperature;

        public Refrigerator(String model, String brand, int temperature) {
            super(model, brand);
            this.temperature = temperature;
        }

        public void orderFood() {
            System.out.println("Refrigerator is ordering food");
        }

        public int getTemperature() {
            return temperature;
        }
    }

    class DishWasher extends Appliances {
        public String getCycle() {
            return cycle;
        }

        private String cycle;

        public DishWasher(String model, String brand, String cycle) {
            super(model, brand);
            this.cycle = cycle;
        }
        public void doDishes(String cycle) {
            System.out.println("Start cleaning cycle: " + cycle);
        }
    }

    class CoffeMaker extends Appliances {

        public CoffeMaker(String model, String brand) {
            super(model, brand);
        }
        public void brewCoffee() {
            System.out.println("Coffee is brewed");
        }
    }


