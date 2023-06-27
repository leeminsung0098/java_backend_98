package com.lms.demo.com.mysite.lms.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {
    @GetMapping("/question/list")
    public String list(){
        return "test";
    }

}
