import Controller.MovieController;
import Model.MovieDatabase;
import View.MovieView;

public class MovieDB_Management {
    public static void main(String[] args) {
        MovieView view = new MovieView();
        MovieDatabase model = new MovieDatabase();
        MovieController controller = new MovieController(model, view);
        controller.processUserInput();
        }

}