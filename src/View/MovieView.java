package View;
import java.util.ArrayList;
import java.util.Scanner;
import Model.Movie;

public class MovieView {
        private final Scanner scanner;
        public MovieView() {
            scanner = new Scanner(System.in);
        }

        public int getMenuChoice() {
            System.out.println("-------------------------------------------");
            System.out.println("Movies Database Management System, Welcome:");
            System.out.println("1. Add a new movie");
            System.out.println("2. Search for a movie");
            System.out.println("3. Display all movies");
            System.out.println("4. Quit");

            System.out.print("Enter your choice (1-4): ");
            return scanner.nextInt();
        }

        public Movie getMovieDetails() {
                scanner.nextLine(); // to not skip the "movie name" input
                System.out.print("Enter movie name: ");
                String title = scanner.nextLine();
                System.out.print("Enter movie director: ");
                String director = scanner.nextLine();
                System.out.print("Enter movie year: ");
                int year = scanner.nextInt();
                return new Movie(title, director, year);

        }

        public String searchForMovie() {
            scanner.nextLine(); // to not skip the "movie name" input
            System.out.print("Enter movie name to search: ");
            return scanner.nextLine();
        }

        public void displayMovie(Movie movie) {
            System.out.println("Movie name: " + movie.getMovieName() + ", Director: " + movie.getDirector() + ", Year: " + movie.getYear() );
        }

        public void displayMovies(ArrayList<Movie> movies) {
            if (movies.isEmpty()) {
                System.out.println("No movies in the database.");
            } else {
                System.out.println("Movies in the database:");
                int count=1;
                for (Movie movie : movies) {
                    System.out.print(count);
                    System.out.print(". ");
                    displayMovie(movie);
                    count++;
                }
            }
        }

        public void displayMessage(String message) {
            System.out.println(message);
        }


}
