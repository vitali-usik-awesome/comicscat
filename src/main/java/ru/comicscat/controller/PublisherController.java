package ru.comicscat.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.comicscat.service.PublisherService;

/**
 * @author Vitali Usik
 * 
 */
@Controller
public class PublisherController {

    private PublisherService publisherService;

    @Autowired
    public void setPublisherService(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @RequestMapping("/pub/{link}")
    public String pubPage(@PathVariable("link") String link, Map<String, Object> map) {
        map.put("pub", publisherService.getPublisher(link));
        return "pub_page";
    }

    @RequestMapping("/localpub/{link}")
    public String localPubPage(@PathVariable("link") String link, Map<String, Object> map) {
        map.put("localPub", publisherService.getLocalPublisher(link));
        return "local_pub_page";
    }

    @RequestMapping("/admin/localpubs")
    public String localPubsPage(Map<String, Object> map) {
        map.put("pub", publisherService.listLocalPubs());
        return "pubsPage";
    }
}
