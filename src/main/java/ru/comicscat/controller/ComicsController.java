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
public class ComicsController {

    private ComicsService comicsService;

    @Autowired
    public void setComicsService(ComicsService comicsService) {
        this.comicsService = comicsService;
    }

    @RequestMapping("/comics/{link}")
    public String comicsPage(@PathVariable("link") String link, Map<String, Object> map) {
        map.put("comics", comicsService.getComics(link));
        return "comics_page";
    }
}
