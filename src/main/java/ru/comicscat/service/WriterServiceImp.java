package ru.comicscat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.comicscat.dao.WriterDAO;
import ru.comicscat.model.Writer;

/**
 * @author Vitali Usik
 *
 */
@Service
public class WriterServiceImp implements WriterService {

    @Autowired
    private WriterDAO writerDao;

    @Transactional
    public Writer getWriter(String link) {
        return writerDao.getWriter(link);
    }
}
