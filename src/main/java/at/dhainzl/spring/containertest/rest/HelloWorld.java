package at.dhainzl.spring.containertest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("api/hello")
    public String getGreeting(@RequestParam(required = true) String name) {
        return "Hello, " + name + "!";
    }
}