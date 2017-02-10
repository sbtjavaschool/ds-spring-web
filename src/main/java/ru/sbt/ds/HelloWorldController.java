package ru.sbt.ds;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //http://localhost:8080/hello?name=Alex
    @RequestMapping("/hello")
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}