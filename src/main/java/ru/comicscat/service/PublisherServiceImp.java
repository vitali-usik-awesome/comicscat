package ru.comicscat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.comicscat.dao.PublisherDAO;
import ru.comicscat.model.LocalPublisher;
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

    @Transactional
    public LocalPublisher getLocalPublisher(String link) {
        return publisherDao.getLocalPublisher(link);
    }

    @Transactional
    public List<LocalPublisher> listLocalPubs() {
        return publisherDao.listLocalPubs();
    }
}
