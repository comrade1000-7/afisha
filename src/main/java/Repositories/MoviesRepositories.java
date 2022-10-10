package Repositories;

import ManagersClasses.Movie;

public class MoviesRepositories {
    private Movie[] items = new Movie[0];

    public Movie[] getItems() {
        return items;
    }

    public Movie[] findAll (MoviesRepositories moviesRepositories) {
        return items;
    }

    public void save (Movie movie) {
        Movie[] tmp = new Movie[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = movie;
        items = tmp;
    }

    public Movie findById (int id) {
        if (items.length == 0) {
            throw new NullPointerException("Репозиторий пустой");
        }
        for (Movie movie : items) {
            if (movie.getId() == id) {
                return movie;
            } else {
                throw new NullPointerException("Объекта не существует");
            }
        }
        return null;
    }

    public void removeById (int id) {
        int index = 0;
        Movie[] tmp = new Movie[items.length - 1];
        for (Movie item : items) {
            if (item.getId() != id) {
                tmp[index] = items[index];
                index++;
            }
        }
        items = tmp;
    }

    public void removeAll() {
        items = new Movie[0];
    }

}
