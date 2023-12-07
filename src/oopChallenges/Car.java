package oopChallenges;

public class Car {

    private String brand = "Telsa";
    private String model = " Model X";
    private String color = "Blue";
    private int doors = 4;
    private boolean convertible = true;

    public void describeCar() {

        System.out.println(doors + "-Doors " + model + "-Model " + color  + "-Color"  + (convertible? " Convertible ": " ")  + brand + "-Brands" );
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
