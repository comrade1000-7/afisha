package ManagersClasses;

public class ManagerMovies {
    private Movie[] repo = new Movie[0];
    private int lastAddedMovies;

    public Movie[] getRepo() {
        return repo.clone();
    }

    public ManagerMovies() {
        this.lastAddedMovies = 10;
    }

    public ManagerMovies(int lastAddedMovies) {
        this.lastAddedMovies = lastAddedMovies;
    }

    public void addMovie (Movie movie) {
        Movie[] tmp = new Movie[repo.length + 1];
        for (int i = 0; i < repo.length; i++) {
            tmp[i] = repo[i];
        }
        tmp[tmp.length - 1] = movie;
        repo = tmp;
    }

    public Movie[] findAll() {
        Movie[] list = new Movie[repo.length];
        for (int i = 0; i < repo.length; i++) {
            list[i] = repo[i];
        }
        return list;
    }

    public Movie[] findLast() {
        int lengthResult = Math.min(lastAddedMovies, repo.length);

        Movie[] lastMovies = new Movie[lengthResult];
        for (int i = 0; i < lastMovies.length; i++) {
            lastMovies[i] = repo[repo.length - 1 - i];
        }

        return lastMovies;
    }

}
