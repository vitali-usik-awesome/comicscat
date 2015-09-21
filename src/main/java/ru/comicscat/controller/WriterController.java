package ru.comicscat.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.comicscat.service.WriterService;

/**
 * @author Vitali Usik
 * 
 */
@Controller
public class WriterController {

    private WriterService writerService;

    @Autowired
    public void setWriterService(WriterService writerService) {
        this.writerService = writerService;
    }

    @RequestMapping("/writer/{link}")
    public String writerPage(@PathVariable("link") String link, Map<String, Object> map) {
        map.put("writer", writerService.getWriter(link));
        return "writer";
    }
}
