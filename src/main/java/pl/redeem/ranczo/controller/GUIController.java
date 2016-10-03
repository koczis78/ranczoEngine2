package pl.redeem.ranczo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GUIController {
    
    @RequestMapping("/gui")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
