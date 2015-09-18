package ru.comicscat.dao;

import java.util.List;

import org.hibernate.Query;
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
    public List<Comics> listComics(int firstResult, int comics_per_page) {
        return sessionFactory.getCurrentSession().createQuery("FROM Comics WHERE comics_status = 'pub' ORDER BY comics_date_added DESC").setFirstResult(firstResult).setMaxResults(comics_per_page).list();
    }

    public Long getPages() {
        Query q = sessionFactory.getCurrentSession().createQuery("SELECT COUNT(c) FROM Comics c WHERE comics_status = 'pub'");
        return (Long) q.uniqueResult();
    }

    public Comics getComics(String link) {
        Comics comics = null;
        Query q = sessionFactory.getCurrentSession().createQuery("FROM Comics WHERE (comics_link = :link)");
        q.setString("link", link);
        comics = (Comics) q.uniqueResult();
        return comics;
    }
}
