package com.melihdumanli.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OtherJSP {

    @GetMapping("/otherPage")
    public String getJspMethod() {
        return "otherfile/other";
    }
}
