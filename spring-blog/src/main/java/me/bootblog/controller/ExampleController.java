package me.bootblog.controller;
import lombok.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class ExampleController {
    @GetMapping("/thymeleaf/example")
    public String thymeleafExample(Model model) {
        Person examplePerson = new Person();
        examplePerson.setId(1L);
        examplePerson.setName("name");
        examplePerson.setAge(11);
        examplePerson.setHobbies(List.of("운동", "쇼츠보기"));

        model.addAttribute("person", examplePerson);
        model.addAttribute("today", LocalDate.now());

        return "example";
    }

    @Getter
    @Setter
    class Person {
        private Long id;
        private String name;
        private Integer age;
        private List<String> hobbies;
    }
}