package inheritence;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(String earShape, String tailShape) {
        super("Labrador", "big", 50.4);

    }  public Dog(String type, double weight) {
        this(type, weight,"long and fluffy", "small and curly");

    }

    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, weight<15? "small" : (weight<35? "medium":"big"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    private void bark(){
        System.out.print("woof! ");
}   private void walk(){
        System.out.print("walk ");
}   private void run(){
        System.out.print("run ");
}private void wagTail(){
        System.out.print("wag tail ");
}

    public void move(String speed){
        super.move(speed);
        if(speed=="slow"){
//            System.out.print("walk slowly ");
            walk();
            wagTail();
        }
        else if(speed=="fast") {
//            System.out.print("run ");
            run();
            makeNoise();
        }
        else System.out.println("cruise");
        System.out.println();
    }

    @Override
    public void makeNoise() {
        if(type=="wolf"){
            System.out.print("woooooooooooooo!");
        }
        else bark();
        System.out.println();
    }


    @Override
    public void randomAction() {
        super.randomAction();
        System.out.println(" wag tail ");

    }

/*public  void randomAction(){
    System.out.println("waig tail");
}*/



    @Override
    public String toString() {
        return super.toString() +
            ", earShape='" + earShape + '\'' +
                    ", tailShape='" + tailShape + '\''
        ;
    }
}
