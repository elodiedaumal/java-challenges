package inheritence;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(String earShape, String tailShape) {
        super("Labrador", "big", 50.4);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void bark(){
        System.out.println("woof");
    } public void run(){
        System.out.println("run");
    } public void walk(){
        System.out.println("walk");
    } public void wagTail(String speed){
        System.out.println("wag tail");
    }
}
