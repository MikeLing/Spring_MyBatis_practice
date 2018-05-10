package com.website.controller;

import com.website.entity.Users;
import com.website.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class IndexController {
    @Resource
    private UsersService usersService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginview(){

        return "loginview";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@ModelAttribute("username") String username, @ModelAttribute("password") String password) {
        Users user = usersService.getUsersByUsername(username);
        if (user != null && user.getPassword().equals(password))
            return "index";
        return "loginview";
    }
}
