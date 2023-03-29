package ro.itschool.springwebservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world") //from the Url, this is the path part
public class HelloWorldResource {

    @GetMapping("/say-hello")
    public String sayHello(){
        return "hello from my first controller!";
    }

    @GetMapping("/say-hello1")
    public String sayHello2(){
        return "hello from my first controller1!";
    }

}
