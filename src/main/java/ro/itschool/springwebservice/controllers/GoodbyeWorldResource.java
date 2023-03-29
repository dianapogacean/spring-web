package ro.itschool.springwebservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goodbye-world")
public class GoodbyeWorldResource {

    @GetMapping("/say-goodbye")
    public String sayHello(){
        return "goodbye!";
    }
}
