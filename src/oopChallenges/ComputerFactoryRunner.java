package oopChallenges;

public class ComputerFactoryRunner {
    public static void main(String[] args) {
ComputerCase theCase = new ComputerCase("2250","Asus","220v");
Monitor theMonitor = new Monitor("4875","Dell",19,"1080p");
        MotherBoard theMotherboard = new MotherBoard("48999975","Intel",8,2,"Ryzen");
PersonalComputer thePc = new PersonalComputer("2250", "Asus",theCase,theMonitor,theMotherboard);

//thePc.getMonitor().drawPixelAt(25,99,"red");
//thePc.getMotherBoard().loadProgram("the sims");
//thePc.getComputerCase().pressPowerButton();

        thePc.powerUp();
    }
}
