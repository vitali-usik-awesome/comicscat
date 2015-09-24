package ru.comicscat.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ru.comicscat.model.LocalPublisher;
import ru.comicscat.model.Publisher;

/**
 * @author Vitali Usik
 *
 */
@Repository
public class PublisherDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Publisher getPublisher(String link) {
        Publisher publisher = null;
        Query q = sessionFactory.getCurrentSession().createQuery("FROM Publisher WHERE (pub_link = :link)");
        q.setString("link", link);
        publisher = (Publisher) q.uniqueResult();
        return publisher;
    }

    public LocalPublisher getLocalPublisher(String link) {
        LocalPublisher localPublisher = null;
        Query q = sessionFactory.getCurrentSession().createQuery("FROM LocalPublisher WHERE (lpub_link = :link)");
        q.setString("link", link);
        localPublisher = (LocalPublisher) q.uniqueResult();
        return localPublisher;
    }
}
