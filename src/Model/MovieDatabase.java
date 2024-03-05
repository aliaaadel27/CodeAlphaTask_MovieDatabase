package Model;

import java.util.ArrayList;

public class MovieDatabase {
    private final ArrayList<Movie> moviesDB;

    public MovieDatabase() {
        this.moviesDB = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        moviesDB.add(movie);
    }
    public ArrayList<Movie> getMoviesDB() {
        return moviesDB;
    }
    public Movie searchMovie(String title) {
        for (Movie movie : moviesDB) {
            if (movie.getMovieName().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }
}
