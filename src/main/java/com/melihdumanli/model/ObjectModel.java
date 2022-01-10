package com.melihdumanli.model;

import com.melihdumanli.dto.StudentDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ObjectModel {

    @GetMapping("/object")
    public String getObject(Model model) {
        StudentDto studentDto = new StudentDto().builder().id(1).name("Melih").surname("Dumanlı").build();

        model.addAttribute("student_key", studentDto);

        return "object";
    }
}
