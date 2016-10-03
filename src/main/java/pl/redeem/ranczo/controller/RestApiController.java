package pl.redeem.ranczo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    
    @RequestMapping("/restApi")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
