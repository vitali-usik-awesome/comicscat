package ru.comicscat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.comicscat.dao.ComicsDAO;
import ru.comicscat.model.Comics;

/**
 * @author Vitali Usik
 *
 */
@Service
public class ComicsServiceImp implements ComicsService {

    @Autowired
    private ComicsDAO comicsDao;
    private Long pages;

    @Transactional
    public Long getPages() {
        if (comicsDao.getPages() % COMICS_PER_PAGE > 0) {
            pages = comicsDao.getPages() / COMICS_PER_PAGE + 1;
        } else {
            pages = comicsDao.getPages() / COMICS_PER_PAGE;
        }
        return pages;
    }

    @Transactional
    public List<Comics> listComics(int page) {
        int fristResult = (COMICS_PER_PAGE * page) - COMICS_PER_PAGE;
        return comicsDao.listComics(fristResult, COMICS_PER_PAGE);
    }
}
