package oopChallenges.Polymorphism1;

public class NextMovieRunner {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("SciFi","Star wars");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("Adventure", "Jaws");

        jaws.watchMovie();

        Object comedy = Movie.getMovie("Comedy" , "fly");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedyMovie();

        comedyMovie.watchMovie();

        var it = Movie.getMovie("Scifi", "it");
        it.watchMovie();

        var fgdb = new Adventure("fgdb");
        fgdb.watchAdventureMovie();
        fgdb.watchMovie();


    }
}
