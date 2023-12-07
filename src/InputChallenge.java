import java.util.Scanner;

public class InputChallenge {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int counter=1;
        double sum=0d;



        while ( counter<=5){
            System.out.println("Enter number #" + counter + ": ");
            String nextNumber= scanner.nextLine();
            try{
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            }
            catch(NumberFormatException e){
                System.out.println(e + " is not a valid number");
            }

        }

        System.out.println("The sum of the 5 numbers is " + sum);

    }
}
