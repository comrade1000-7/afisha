package ManagersClasses;

public class Movie {
    private int id;
    private String title;
    private String director;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getYear() {
        return year;
    }

    private String year;

    public Movie(int id, String title, String director, String year) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.year = year;
    }
}
