package ru.comicscat.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ru.comicscat.model.Writer;

/**
 * @author Vitali Usik
 *
 */
@Repository
public class WriterDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Writer getWriter(String link) {
        Writer writer = null;
        Query q = sessionFactory.getCurrentSession().createQuery("FROM Writer WHERE (writer_link = :link)");
        q.setString("link", link);
        writer = (Writer) q.uniqueResult();
        return writer;
    }
}
