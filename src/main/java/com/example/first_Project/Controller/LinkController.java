package com.example.first_Project.Controller;

import com.example.first_Project.dto.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LinkController {
    @GetMapping("/link")
    public String link(Model model) {
        model.addAttribute("name", "장원영");
        model.addAttribute("age", 21);

//        구두번호 보내기
        int shoesNumber = 7;
        model.addAttribute("shoesNumber", shoesNumber);
        return "link";
    }

    @GetMapping("/url")
    public String basicUrl() {
        return "/link/basicUrl";
    }

    //        /getInfo(name=${name},age=${age})
//    http://localhost:8080/getInfo?name=장원영&age=21 이렇게 표시되게 한다.
    @GetMapping("/getInfo")
    public String getInfo(@RequestParam("name") String name, @RequestParam("age") int age, Model model) {

        UserData userData = new UserData();

        userData.setUserName(name);
        userData.setUserAge(age);

        model.addAttribute("data", userData);
        return "/link/info";
    }

    //    PathVariable 처리
    @GetMapping("/shoes/details/{id}")
    public String details(@PathVariable("id") int id, Model model) {
        model.addAttribute("id", id);

        return "/link/details";
    }

    //    Path + Query
//    /shoes/{id}(id=${shoesNumber} ,name=${name})
    @GetMapping("/shoes/{id}")
    public String selectShoes(@RequestParam("name") String name, @PathVariable("id") String id, Model model) {

        Map<String, String> select = new HashMap<>();
        select.put("name", name);
        select.put("id", id);
        model.addAttribute("map", select);
        return "/link/result";
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }
}
