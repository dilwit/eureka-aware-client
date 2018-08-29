package net.dilwit.springboot.ms.eurekaawareclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello from EurekaClient!";
    }

}
