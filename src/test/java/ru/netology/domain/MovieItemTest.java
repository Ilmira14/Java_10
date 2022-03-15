package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieItemTest {

    @Test
    void getId() {
        return;
    }

    @Test
    void getImageUrl() {
        return;
    }

    @Test
    void getTitle() {
        return;
    }

    @Test
    void getGenre() {
        return;
    }

    @Test
    void setId() {
        MovieItem movie = new MovieItem();
        movie.setId(1);

        int expected = 1;
        int actual = movie.getId();
        assertEquals(expected, actual);
    }

    @Test
    void setImageUrl() {
        MovieItem movie = new MovieItem();
        movie.setImageUrl(111);

        int expected = 111;
        int actual = movie.getImageUrl();
        assertEquals(expected, actual);
    }

    @Test
    void setTitle() {
        MovieItem movie = new MovieItem();
        movie.setTitle("Джентльмены");

        String expected = "Джентльмены";
        String actual = movie.getTitle();
        assertEquals(expected, actual);
    }

    @Test
    void setGenre() {
        MovieItem movie = new MovieItem();
        movie.setGenre("комедия");

        String expected = "комедия";
        String actual = movie.getGenre();
        assertEquals(expected, actual);
    }
}