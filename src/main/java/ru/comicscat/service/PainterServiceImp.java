package ru.comicscat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.comicscat.dao.PainterDAO;
import ru.comicscat.model.Painter;

/**
 * @author Vitali Usik
 *
 */
@Service
public class PainterServiceImp implements PainterService {

    @Autowired
    private PainterDAO painterDao;

    @Transactional
    public Painter getPainter(String link) {
        return painterDao.getPainter(link);
    }
}
