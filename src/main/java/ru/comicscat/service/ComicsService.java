package ru.comicscat.service;

import java.util.List;

import ru.comicscat.model.Comics;

/**
 * @author Vitali Usik
 *
 */
public interface ComicsService {
    final static Integer COMICS_PER_PAGE = 3;
    public List<Comics> listComics(int page);
    public Long getPages();
    public Comics getComics(String link);
}
