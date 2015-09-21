package ru.comicscat.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ru.comicscat.model.Painter;

/**
 * @author Vitali Usik
 *
 */
@Repository
public class PainterDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Painter getPainter(String link) {
        Painter painter = null;
        Query q = sessionFactory.getCurrentSession().createQuery("FROM Painter WHERE (painter_link = :link)");
        q.setString("link", link);
        painter = (Painter) q.uniqueResult();
        return painter;
    }
}
