package com.example.first_Project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/articles")

public class ArticleController {


    @GetMapping("/list")
    public String list() {
        return "articles/list_all";
    }

    @GetMapping("/{id}")
    public String selectList(@RequestParam("number") String number, Model model) {
        Map<String, String> select = new HashMap<>();
        select.put("number", number);
        model.addAttribute("map", select);

        return "/articles/list_one.html";
    }
}
