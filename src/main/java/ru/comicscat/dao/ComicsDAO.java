package ru.comicscat.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ru.comicscat.model.Comics;

/**
 * @author Vitali Usik
 *
 */
@Repository
public class ComicsDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<Comics> listComics() {
        return sessionFactory.getCurrentSession().createQuery("FROM Comics WHERE comics_status = 'pub' ORDER BY comics_date_added DESC").setFirstResult(1).setMaxResults(2).list();
    }
}
