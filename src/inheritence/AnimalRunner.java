package inheritence;

public class AnimalRunner {
    public static void main(String[] args) {

        Animal animal=new Animal("Whatever Animal" ,"huge", 659.87);

        doAnimalStuff(animal,"fast");

        Dog dog = new Dog("chihaua",2.00,"small ear", "long tail" );

        doAnimalStuff(dog,"slow");

        Dog dog2 = new Dog("wiener",10.00 );

        doAnimalStuff(dog2,"fast");

        Dog dog3 = new Dog("Golden retriever",45.00, "floppy", "swimmer" );

        doAnimalStuff(dog3,"slow");
    }

    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
//        animal.randomAction();

        System.out.println(animal);

        System.out.println("____________");
    }


}
