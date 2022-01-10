package com.melihdumanli.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstModel {

    //localhost:8080/firstapp
    @GetMapping("/firstapp")
    @ResponseBody
    public String firstMethod() {
        return "firstMethod";
    }
}
