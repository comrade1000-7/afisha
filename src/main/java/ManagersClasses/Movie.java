package ManagersClasses;

public class Movie {
    String title;
    String director;
    String year;

    public Movie(String title, String director, String year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public void showMovie() {
        System.out.println(title);
        System.out.println(director);
        System.out.println(year);
    }
}
