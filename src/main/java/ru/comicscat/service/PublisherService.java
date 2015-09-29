package ru.comicscat.service;

import java.util.List;

import ru.comicscat.model.LocalPublisher;
import ru.comicscat.model.Publisher;

public interface PublisherService {
    public Publisher getPublisher(String link);
    public LocalPublisher getLocalPublisher(String link);
    public List<LocalPublisher> listLocalPubs();
}
