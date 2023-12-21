package oopChallenges.Polymorphism1;

import java.util.Scanner;

public class MovieRunner {
    public static void main(String[] args) {
//Movie theMovie = Movie.getMovie("comedy", "LOTR");
//theMovie.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while(true) {

            System.out.println("Enter Type (SciFi, Adventure or Comedy) or Q to quit");
            String type = scanner.nextLine();
            if("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie title");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();

        }

    }
}
