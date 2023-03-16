
package ru.netology.postermanager;
public class FilmManager {

    private String[] films = new String[0];
    private int limit;

    public FilmManager() {
        this.limit = 10;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }
    public void addNewFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAllFilms() {
        return films;
    }

    public String[] findLastFilms() {
        int lastFilmsLength;
        if(films.length < limit){
            lastFilmsLength = films.length;
        } else {
            lastFilmsLength = limit;
        }

        String[] result = new String[lastFilmsLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

}
