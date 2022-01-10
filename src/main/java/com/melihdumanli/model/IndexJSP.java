package com.melihdumanli.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexJSP {

    @GetMapping("/firstJsp")
    public String getJsp() {
        return "index";
    }
}
