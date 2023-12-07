import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int counter=0;

        double max=0;
        double min=0;

        while ( counter<=5){
            System.out.println("Enter a number or any character to exit the program");
            String nextNumber= scanner.nextLine();
            try{
                double number = Double.parseDouble(nextNumber);
                if (counter==0 || number<min) {
                    min=number;
                }if (counter==0 || number>max) {
                    max=number;
                }
                counter ++;

                System.out.println("The maximum number entered is " + max + " and the minimum number entered is " + min );
               }
            catch(NumberFormatException e){
                break;
            }

        }



    }

    }

