import ManagersClasses.Movie;
import Repositories.MoviesRepositories;

public class Main {
    public static void main(String[] args) {
        MoviesRepositories test = new MoviesRepositories();
        Movie film = new Movie(22, "2012", "Po", "1990");
        test.save(film);
        test.findById(40);
    }
}
