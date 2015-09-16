package ru.comicscat.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Vitali Usik
 * 
 */
@Controller
public class HomeController {

    @RequestMapping({"/", "/home"})
    public String homePage(Map<String, Object> map) {
        return "home";
    }
}
