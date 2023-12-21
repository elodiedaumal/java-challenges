package oopChallenges.PolymorphismChallenge;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(description + " is a " + instanceType + " car");
        System.out.println("Engine is turned On");
    }

    private void runEngine() {
        System.out.println("Engine is running");
    }

    public static Car getCar(String type, String description, int cylinder, double avgKmPerLitre, double avgKmPerCharge, int batteryStatus) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(description, cylinder, avgKmPerLitre);
            case 'E' -> new ElectricCar(description, avgKmPerCharge, batteryStatus);
            case 'H' -> new HybridCar(description, avgKmPerLitre, cylinder, batteryStatus);
            default -> new Car(description);
        };
    }
}

class GasPoweredCar extends Car {
    private int cylinder;
    private double avgKmPerLitre;

    public GasPoweredCar(String description, int cylinder, double avgKmPerLitre) {
        super(description);
        this.cylinder = cylinder;
        this.avgKmPerLitre = avgKmPerLitre;
    }



    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("gas is being added to the engine");
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private  int batteryStatus;

    public ElectricCar(String description, double avgKmPerCharge, int batteryStatus) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batteryStatus = batteryStatus;
    }
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("electricity is being added to the engine");
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int cylinder;
    private  int batteryStatus;

    public HybridCar(String description, double avgKmPerLitre, int cylinder, int batteryStatus) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinder = cylinder;
        this.batteryStatus = batteryStatus;
    }
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("gas and electricity is being added to the engine");
    }
}
