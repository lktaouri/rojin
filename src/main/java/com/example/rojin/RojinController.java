package com.example.rojin;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RojinController {
    @RequestMapping("/Hello")
    public String index(){
        return "Rojin";
    }
}
