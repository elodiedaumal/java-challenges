package methodChallenges;

public class Switch {
    public static void main(String[] args) {

        String word = "ABXBA";

        for (char currentChar : word.toCharArray()) {
            switch (currentChar) {
                case 'A'->System.out.print("Able, ");

                case 'B'->System.out.print("Babar, ");

                default -> System.out.print("not a character, ");
            }


        }

    }
    }