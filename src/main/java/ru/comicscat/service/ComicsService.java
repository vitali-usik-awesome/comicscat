package ru.comicscat.service;

import java.util.List;

import ru.comicscat.model.Comics;

/**
 * @author Vitali Usik
 *
 */
public interface ComicsService {
    final static Integer COMICS_PER_PAGE = 2;
    public List<Comics> listComics(int page);
    public Long getPages();
    //public Object listComics(String page);
}
