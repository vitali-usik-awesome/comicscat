package ru.comicscat.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ru.comicscat.model.Comics;
import ru.comicscat.service.ComicsService;
import ru.comicscat.service.ComicsServiceImp;

/**
 * @author Vitali Usik
 * 
 */
public class HomeControllerTest {

    ComicsService comicsService;
    HomeController controller;

    @Before
    public void setUp() {
        comicsService = mock(ComicsServiceImp.class);
        controller = new HomeController();
        controller.setComicsService(comicsService);
    }

    @Test
    public void shouldDisplayComics() {
        List<Comics> expectedComics = Arrays.asList(new Comics(), new Comics());
        when(comicsService.listComics()).thenReturn(expectedComics);
        HashMap<String, Object> model = new HashMap<String, Object>();
        String viewName = controller.homePage(model);
        assertEquals("home", viewName);
        assertSame(expectedComics, model.get("comicsList"));
    }
}
