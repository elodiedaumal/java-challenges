package oopChallenges.Printer;

public class PrinterRunner {
    public static void main(String[] args) {
Printer myPrinter = new Printer(50,true);
int pagesPrinted=myPrinter.printPages(5);
myPrinter.addToner(-10);
        System.out.println(pagesPrinted + " " + myPrinter.getPagesPrinted());
        System.out.println("toner level= " + myPrinter.getTonerLevel());
        myPrinter.printPages(5);
        System.out.println(myPrinter.getPagesPrinted());
    }


}
