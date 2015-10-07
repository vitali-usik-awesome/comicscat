package ru.comicscat.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.comicscat.dao.UserDAO;
import ru.comicscat.model.User;

/**
 * @author Vitali Usik
 *
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDAO userDao;

    @Transactional
    public void saveProfile(User user) {
        if (user.getUser_register_date() == null) {
            user.setUser_register_date(new Date());
        }
        userDao.saveProfile(user);
    }
}
