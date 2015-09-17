package ru.comicscat.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.comicscat.service.ComicsService;

/**
 * @author Vitali Usik
 * 
 */
@Controller
public class HomeController {

    private ComicsService comicsService;

    @Autowired
    public void setComicsService(ComicsService comicsService) {
        this.comicsService = comicsService;
    }

    @RequestMapping({"/", "/home"})
    public String homePage(Map<String, Object> map) {
        map.put("comicsList", comicsService.listComics());
        return "home";
    }
}
