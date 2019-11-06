package at.dhainzl.spring.containertest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("api/hello")
    public String getGreeting() {
        return "Hello, World!";
    }
}