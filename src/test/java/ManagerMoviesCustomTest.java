import ManagersClasses.ManagerMovies;
import ManagersClasses.Movie;
import org.junit.jupiter.api.*;


public class ManagerMoviesCustomTest {
    ManagerMovies managerMovies = new ManagerMovies(2);

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
    public void shouldFindLast() {
        Movie[] actual = managerMovies.findLast();
        Movie[] expected = {armageddon, twilight};

        Assertions.assertArrayEquals(expected, actual);
    }
}
