package oopChallenges.Polymorphism1;

public class Movie {
    private String title;



    public Movie(String title) {
        this.title = title;

    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case'A' ->new Adventure(title);
            case'S' ->new SciFi(title);
            case'C' ->new Comedy(title);

            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3), "Pleasant scene","landscape images", "love story ");
    }


}

class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3), "Pleasant scene","Funny jokes", "someone fell");
    }


}

class SciFi extends Movie {

    public SciFi(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3), "Space scene","fight alien", "Return to earth");
    }


}
