package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MoviePosterManager {

    private MovieItem[] items = new MovieItem[0];
    private int maxLength = 10;

    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] findAll() {
        return items;
    }

    public MovieItem[] getLastMovies() {

        int resultLength;
        if (items.length < maxLength) {
            resultLength = items.length;
        } else {
            resultLength = maxLength;
        }

        MovieItem[] result = new MovieItem[resultLength];
        int index = 0;
        for (int i = 0; i < resultLength; i++) {
            index = resultLength - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}