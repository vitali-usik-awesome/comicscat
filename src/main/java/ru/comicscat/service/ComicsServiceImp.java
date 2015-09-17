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

    @Transactional
    public List<Comics> listComics() {
        return comicsDao.listComics();
    }
}
