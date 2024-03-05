package Controller;
import Model.Movie;
import Model.MovieDatabase;
import View.MovieView;
import java.util.ArrayList;

public class MovieController {
    private final MovieDatabase DBmodel;
    private final MovieView view;

    public MovieController(MovieDatabase model, MovieView view) {
        this.DBmodel = model;
        this.view = view;
    }

    public void processUserInput() {
        while (true) {
            int choice = view.getMenuChoice();

            switch (choice) {
                case 1:
                    Movie movie = view.getMovieDetails();
                    DBmodel.addMovie(movie);
                    view.displayMessage(movie.getMovieName() + " added to the database.");
                    break;
                case 2:
                    String searchName = view.searchForMovie();
                    Movie foundMovie = DBmodel.searchMovie(searchName);
                    if (foundMovie != null) {
                        view.displayMovie(foundMovie);
                    } else {
                        view.displayMessage("Movie not found in the database.");
                    }
                    break;
                case 3:
                    ArrayList<Movie> allMovies = DBmodel.getMoviesDB();
                    view.displayMovies(allMovies);
                    break;
                case 4:
                    view.displayMessage("Exiting the program.");
                    return;
                default:
                    view.displayMessage("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}