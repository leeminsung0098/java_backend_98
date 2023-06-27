package com.lms.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

     @RequestMapping("/lms")
     @ResponseBody
     public  String index(){
        return "안녕핫요";
    }

}
