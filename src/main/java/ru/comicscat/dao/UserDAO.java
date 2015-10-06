package ru.comicscat.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ru.comicscat.model.User;

/**
 * @author Vitali Usik
 *
 */
@Repository
public class UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveProfile(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }
}
