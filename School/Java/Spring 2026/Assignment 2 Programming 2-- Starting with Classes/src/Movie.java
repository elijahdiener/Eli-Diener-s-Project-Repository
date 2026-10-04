import static java.lang.System.*;


public class Movie
{
    private String title;
    private int runningTime;
    private int releaseYear;

    public static void main(String[] args)
    {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie("Star Wars", 121, 1997);
        out.printf("Movie 1: %s\nMovie 2: %s", movie1, movie2);
    }

    public Movie(String title, int runningTime, int releaseYear)
    {
        this.title = title;
        this.runningTime = runningTime;
        this.releaseYear = releaseYear;
    }

    public Movie()
    {
        this("The Matrix", 136, 1999);
    }

    @Override
    public String toString()
    {
        return title + " (" + releaseYear + ") (" + runningTime + " minutes)";
    }
}
