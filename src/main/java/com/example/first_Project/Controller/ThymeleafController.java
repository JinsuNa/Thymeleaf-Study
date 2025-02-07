package com.example.first_Project.Controller;


import com.example.first_Project.dto.Animal;
import com.example.first_Project.dto.Fruits;
import com.example.first_Project.dto.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.*;


@Controller
@RequestMapping("/basic")
public class ThymeleafController {

    @GetMapping("/date")
    public String date(Model model) {
        model.addAttribute("nowDateTime", LocalDateTime.now());
        return "utility/date";
    }

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

//       @RequiredArgsConstructor사용방법
//        UserData userData = new UserData("홍길동", 10);

        model.addAttribute("userData", userData);
        model.addAttribute("data", "장원영");

//        리스트 작업하기
        List<Fruits> fruits = new ArrayList<>();
        Fruits apple = new Fruits("사과", "신맛");
        Fruits mango = new Fruits("망고", "단맛");

        fruits.add(apple);
        fruits.add(mango);

        model.addAttribute("fruits", fruits);
        System.out.println(fruits);

//        map으로 작업하기
        Map<String, Animal> animalMap = new HashMap<>();

        Animal dog = new Animal();
        dog.setName("멍멍이");
        dog.setSound("멍멍");

        Animal cat = new Animal();
        cat.setName("야옹이");
        cat.setSound("냐오옹");

        animalMap.put("dog", dog);
        animalMap.put("cat", cat);
        model.addAttribute("map", animalMap);
        return "/basic/variables";
    }

    @GetMapping("/literal")
    public String literal(Model model) {
        model.addAttribute("data", "Spring!");
        return "/basic/literal";
    }

    @GetMapping("/operation")
    public String operation(Model model) {
        model.addAttribute("nullData", null);
        model.addAttribute("name", "나진수");
        return "/basic/operation";
    }

    @GetMapping("/attribute")
    public String attribute() {
        return "/basic/attribute";

    }

    @GetMapping("/for")
    public String forOperation(Model model) {
        addUser(model);
        return "/basic/for_opr";
    }

    private void addUser(Model model) {
        List<UserData> userList = new ArrayList<>(
                Arrays.asList(
                        new UserData("나진수", 31, "서울"),
                        new UserData("장원영", 20, "인천"),
                        new UserData("안유진", 23, "경기"),
                        new UserData("카리나", 25, "수원"),
                        new UserData("윈터", 22, "대전"),
                        new UserData("수똥", 25, "부산")
                )
        );
        model.addAttribute(userList);

    }

}
