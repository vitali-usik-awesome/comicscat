package ru.comicscat.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.comicscat.service.PainterService;

/**
 * @author Vitali Usik
 * 
 */
@Controller
public class PainterController {

    private PainterService painterService;

    @Autowired
    public void setPainterService(PainterService painterService) {
        this.painterService = painterService;
    }

    @RequestMapping("/painter/{link}")
    public String writerPage(@PathVariable("link") String link, Map<String, Object> map) {
        map.put("painter", painterService.getPainter(link));
        return "painter";
    }
}
