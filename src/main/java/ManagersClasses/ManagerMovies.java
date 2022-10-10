package ManagersClasses;

import Repositories.MoviesRepositories;

public class ManagerMovies {
    private MoviesRepositories repo;
    private int lastAddedMovies;

    public ManagerMovies(MoviesRepositories repo) {
        this.repo = repo;
        this.lastAddedMovies = 10;
    }

    public ManagerMovies(MoviesRepositories repo, int lastAddedMovies) {
        this.repo = repo;
        this.lastAddedMovies = lastAddedMovies;
    }

    public Movie[] findLast(MoviesRepositories repo) {
        int lengthResult = Math.min(repo.getItems().length, lastAddedMovies);

        Movie[] lastMovies = new Movie[lengthResult];
        for (int i = 0; i < lastMovies.length; i++) {
            lastMovies[i] = repo.getItems()[lengthResult - 1 - i];
        }

        return lastMovies;
    }
}
