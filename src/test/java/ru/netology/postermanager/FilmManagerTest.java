package ru.netology.postermanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void testFindFilms(){
        FilmManager manager = new FilmManager();

        manager.addNewFilm("Film 1");
        manager.addNewFilm("Film 2");
        manager.addNewFilm("Film 3");
        manager.addNewFilm("Film 4");
        manager.addNewFilm("Film 5");
        manager.addNewFilm("Film 6");
        manager.addNewFilm("Film 7");
        manager.addNewFilm("Film 8");
        manager.addNewFilm("Film 9");
        manager.addNewFilm("Film 10");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7","Film 8", "Film 9", "Film 10"};
        String[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast(){
        FilmManager manager = new FilmManager();

        manager.addNewFilm("Film 1");
        manager.addNewFilm("Film 2");
        manager.addNewFilm("Film 3");
        manager.addNewFilm("Film 4");
        manager.addNewFilm("Film 5");
        manager.addNewFilm("Film 6");
        manager.addNewFilm("Film 7");
        manager.addNewFilm("Film 8");
        manager.addNewFilm("Film 9");
        manager.addNewFilm("Film 10");
        manager.addNewFilm("Film 11");
        manager.addNewFilm("Film 12");

        String[] expected = {"Film 12", "Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6","Film 5", "Film 4", "Film 3"};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastTen(){
        FilmManager manager = new FilmManager();

        manager.addNewFilm("Film 1");
        manager.addNewFilm("Film 2");
        manager.addNewFilm("Film 3");
        manager.addNewFilm("Film 4");
        manager.addNewFilm("Film 5");
        manager.addNewFilm("Film 6");
        manager.addNewFilm("Film 7");
        manager.addNewFilm("Film 8");
        manager.addNewFilm("Film 9");
        manager.addNewFilm("Film 10");


        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4","Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLengthLastLessFilmsLength(){
        FilmManager manager = new FilmManager();

        manager.addNewFilm("Film 1");
        manager.addNewFilm("Film 2");
        manager.addNewFilm("Film 3");
        manager.addNewFilm("Film 4");
        manager.addNewFilm("Film 5");
        manager.addNewFilm("Film 6");
        manager.addNewFilm("Film 7");
        manager.addNewFilm("Film 8");



        String[] expected = { "Film 8", "Film 7", "Film 6", "Film 5", "Film 4","Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLimitFilms(){
        FilmManager manager = new FilmManager(10);

        manager.addNewFilm("Film 1");
        manager.addNewFilm("Film 2");
        manager.addNewFilm("Film 3");
        manager.addNewFilm("Film 4");
        manager.addNewFilm("Film 5");
        manager.addNewFilm("Film 6");
        manager.addNewFilm("Film 7");
        manager.addNewFilm("Film 8");
        manager.addNewFilm("Film 9");
        manager.addNewFilm("Film 10");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7","Film 8", "Film 9", "Film 10"};
        String[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
}
