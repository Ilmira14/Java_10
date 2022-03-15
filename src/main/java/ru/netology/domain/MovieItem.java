package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MovieItem {
    private int id;
    private int imageUrl;
    private String title;
    private String genre;
}
