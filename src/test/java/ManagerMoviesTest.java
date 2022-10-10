import ManagersClasses.ManagerMovies;
import ManagersClasses.Movie;
import org.junit.jupiter.api.*;

public class ManagerMoviesTest {
    ManagerMovies managerMovies = new ManagerMovies();

    Movie matrix = new Movie("Матрица", "Вачовски", "1999");
    Movie twilight = new Movie("Сумерки", "Тоторо", "2003");
    Movie armageddon = new Movie("Армегеддон", "Бэйн", "2010");

    @BeforeEach
    public void setup() {
        managerMovies.addMovie(matrix);
        managerMovies.addMovie(twilight);
        managerMovies.addMovie(armageddon);
    }

    @Test
    public void shouldAddMovie () {

        Movie movieTest = new Movie("1488", "Спилберг", "2011");
        managerMovies.addMovie(movieTest);
        Movie[] actual = managerMovies.getRepo();
        Movie[] expected = {matrix, twilight, armageddon, movieTest};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        Movie[] actual = managerMovies.findLast();
        Movie[] expected = {armageddon, twilight, matrix};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        Movie[] actual = managerMovies.findAll();
        Movie[] expected = {matrix, twilight, armageddon};

        Assertions.assertArrayEquals(expected, actual);
    }
}
