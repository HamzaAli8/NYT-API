package demo.consumingAPI.controller;

import demo.consumingAPI.models.Article;
import demo.consumingAPI.service.NytService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nyt")
public class NytController {

    @Autowired
    NytService service;


//    @RequestMapping("/")
//    public List<Article> getArticles(@RequestParam("q") String query){
//
//        return service.getArticles(query);

//    }
    @GetMapping("/current")
    public String home(@RequestParam(value = "term", required = false, defaultValue = "coding") String term, Model model){



        model.addAttribute("articleList", service.getArticles(term));

        return "index";
    }


}
