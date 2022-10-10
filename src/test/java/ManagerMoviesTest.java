import ManagersClasses.ManagerMovies;
import ManagersClasses.Movie;
import Repositories.MoviesRepositories;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class ManagerMoviesTest {
    MoviesRepositories repo = Mockito.mock(MoviesRepositories.class);
    ManagerMovies managerMovies = new ManagerMovies(repo);

    Movie matrix = new Movie(1, "Матрица", "Вачовски", "1999");
    Movie twilight = new Movie(2, "Сумерки", "Тоторо", "2003");
    Movie armageddon = new Movie(3, "Армегеддон", "Бэйн", "2010");

    @Test
    public void shouldReturnLastAddedMovies() {
        Movie[] items = {matrix, twilight, armageddon};
        doReturn(items).when(repo).getItems();

        Movie[] expected = {armageddon, twilight, matrix};
        Movie[] actual = managerMovies.findLast(repo);

        Assertions.assertArrayEquals(expected, actual);
    }
}
