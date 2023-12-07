package oopChallenges;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.getBrand());
        car.setBrand("Renault");

        System.out.println(car.getBrand());
        car.describeCar();
    }
}
