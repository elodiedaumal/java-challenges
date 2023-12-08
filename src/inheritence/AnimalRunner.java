package inheritence;

public class AnimalRunner {
    public static void main(String[] args) {

        Animal animal=new Animal("Whatever Animal" ,"huge", 659.87);

        doAnimalStuff(animal,"fast");

        Dog dog = new Dog("small ear", "long tail");

        doAnimalStuff(dog,"slow");
    }

    public static void doAnimalStuff(Animal animal,String speed){
animal.makeNoise();
animal.move(speed);
        System.out.println(animal);
        System.out.println("____________");
    }
}
