package ru.karaban.currency;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/1")
    public String index() {
        return "Greetings from Spring Boot!11111";
    }

}
