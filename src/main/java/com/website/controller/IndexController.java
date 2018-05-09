package com.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginview(){
        return "loginview";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@ModelAttribute("username") String username, @ModelAttribute("password") String password){
        if (username.equals("jeff") && password.equals("123"))
            return "index";

        return "loginview";
    }
}
