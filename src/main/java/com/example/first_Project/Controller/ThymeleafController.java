package com.example.first_Project.Controller;


import com.example.first_Project.dto.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/basic")
public class ThymeleafController {
    @GetMapping("text-basic")
    public String textBasic(Model model) {
        model.addAttribute("name", "안유진");
        model.addAttribute("mylove", "나진수");

        return "/basic/text-basic";
    }


    @GetMapping("variables")
    public String variables(Model model) {

//        @AllArgsConstructor 사용방법
        UserData userData = new UserData("장원영", 20, "서울");

////        @RequiredArgsConstructor사용방법
//        UserData userData = new UserData("홍길동", 10);

        model.addAttribute("userData", userData);
        model.addAttribute("data", "장원영");
        return "/basic/variables";
    }
}
