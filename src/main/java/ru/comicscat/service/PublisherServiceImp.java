package ru.comicscat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.comicscat.dao.PublisherDAO;
import ru.comicscat.model.Publisher;

/**
 * @author Vitali Usik
 *
 */
@Service
public class PublisherServiceImp implements PublisherService {

    @Autowired
    private PublisherDAO publisherDao;

    @Transactional
    public Publisher getPublisher(String link) {
        return publisherDao.getPublisher(link);
    }
}
