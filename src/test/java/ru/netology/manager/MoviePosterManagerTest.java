package ru.netology.manager;

import lombok.Data;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

class MoviePosterManagerTest {
    MovieItem first = new MovieItem(1, 111, "Бладшот", "боевик");
    MovieItem second = new MovieItem(2,222, "Вперед", "мультфильм");
    MovieItem third = new MovieItem(3, 333,"Отель 'Белград'", "комедия");
    MovieItem fourth = new MovieItem(4,444, "Джентльмены", "боевик");
    MovieItem fifth = new MovieItem(5,555, "Человек-невидимка", "ужасы");
    MovieItem sixth = new MovieItem(6, 666,"Тролли. Мировой тур", "мультфильм");
    MovieItem seventh = new MovieItem(7, 777, "Номер один", "комедия");
    MovieItem eighth = new MovieItem(8,888, "Джентльмены удачи", "комедия");
    MovieItem ninth = new MovieItem(9,999, "Человек паук", "фантастика");
    MovieItem tenth = new MovieItem(10, 1000,"Тролли 2", "мультфильм");
    MovieItem eleventh = new MovieItem(11, 1100, "Номер два", "комедия");

    @Test
    public void shouldAddIfEmpty() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.add(first);

        MovieItem[] expected = {first};
        MovieItem[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddIfAlreadyContains() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.add(first);
        manager.add(second);

        manager.add(third);

        MovieItem[] expected = {first, second, third};
        MovieItem[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastMoviesIfLessThanTen() {
        MoviePosterManager manager = new MoviePosterManager(10);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        MovieItem[] expected = {seventh, sixth, fifth, fourth, third, second, first};
        MovieItem[] actual = manager.getLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastMoviesIfEqualsTen() {
        MoviePosterManager manager = new MoviePosterManager(10);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MovieItem[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        MovieItem[] actual = manager.getLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastMoviesIfMoreThanTen() {
        MoviePosterManager manager = new MoviePosterManager(10);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        MovieItem[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        MovieItem[] actual = manager.getLastMovies();
        assertArrayEquals(expected, actual);
    }
}