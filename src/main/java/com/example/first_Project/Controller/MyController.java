package com.example.first_Project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

//request 는 localhost:8080/main 밑에 아래 mypage, about 이 들어간다는 말이다 main이 무조건 들어간다는 뜻
@RequestMapping("/main")

public class MyController {

    @GetMapping({"/mypage", "/myPage"})
    public String getMyPage() {

        return "mypage";
    }

    @GetMapping({"/about", "/About"})
    public String getAbout() {

        return "about";
    }

}
