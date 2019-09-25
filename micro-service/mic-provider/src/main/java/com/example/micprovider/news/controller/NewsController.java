package com.example.micprovider.news.controller;
import com.example.micprovider.news.entities.News;
import com.example.micprovider.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newService;





    @RequestMapping("/pull")
     public List<News> queue(){
        List<News> all = newService.getAll();
         return all ;
     }



}
