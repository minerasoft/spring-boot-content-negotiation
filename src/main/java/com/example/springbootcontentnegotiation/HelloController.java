package com.example.springbootcontentnegotiation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/greetings", produces = "application/json", method = RequestMethod.GET)
    public @ResponseBody
    String getEmployeeById() {
        return "Hello World";
    }
}
