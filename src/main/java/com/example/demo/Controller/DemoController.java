package com.example.demo.Controller;

import com.example.demo.Model.News;
import com.example.demo.Repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class DemoController {
    @Autowired
    private NewsRepository news;
    
    @RequestMapping("/")
    private String index(Map<String,Object> map){
        map.put("list", news.findAll());
        map.put("title", "demo");
        return "/index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<News> json(){
        return news.findAll();
    }
}
