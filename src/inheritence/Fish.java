package inheritence;

public class Fish extends Animal {

    private int fins;
    private int gills;

    public Fish(String type,  double weight, int fins, int gills) {
        super(type, weight<0.2? "tiny" : (weight<0.5? "very small":"small"), weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles(){
        System.out.print("swim ");
    }

    private void moveBackFins(){
    System.out.print("move fins ");
}

    public void move(String speed){
        super.move(speed);

            moveMuscles();

        if(speed=="fast") {

            moveBackFins();

        }

        System.out.println();
    }


    @Override
    public String toString() {
        return super.toString() +
                ", fins=" + fins +
                ", gills=" + gills + " ";
    }
}