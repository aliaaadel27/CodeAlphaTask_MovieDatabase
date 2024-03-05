package Model;

public class Movie {
    private String MovieName;
    private String director;
    private int year;

    public Movie(String movieName, String director, int year) {
        MovieName = movieName;
        this.director = director;
        this.year = year;
    }


    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
