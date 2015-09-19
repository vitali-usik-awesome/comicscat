package ru.comicscat.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
        map.put("comicsList", comicsService.listComics(0));
        map.put("pages", comicsService.getPages());
        return "home";
    }

    @RequestMapping("/page={page}")
    public String comicsPage(@PathVariable("page") String pageStr, Map<String, Object> map) {
        int page = Integer.parseInt(pageStr);
        map.put("comicsList", comicsService.listComics(page));
        map.put("pages", comicsService.getPages());
        return "home";
    }
}
