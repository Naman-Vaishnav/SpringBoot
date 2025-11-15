package com.ncv.testWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
public class HomeController {

    @RequestMapping("/")
    // @ResponseBody
    public String handle(){
        System.out.println("In Controller");
        return "Welcome !";
    }

    @RequestMapping("/about")
    public String about(){
        return "Still We Rise!!";
    }

}
