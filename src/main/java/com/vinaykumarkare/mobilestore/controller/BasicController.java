package com.vinaykumarkare.mobilestore.controller;

import com.vinaykumarkare.mobilestore.service.MobileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



import java.security.Principal;

@Controller
public class BasicController {


    @Autowired
    private MobileService mobileService;


    @GetMapping("/")
    public String landing()
    {
        return "index";
    }



    @GetMapping("/loginPage")
    public String login()
    {
        return "login-page";
    }

    @GetMapping("/successHandler")
    public String successHandler(Principal loggedUser, Model theModel)
    {
        theModel.addAttribute("loggedUser",loggedUser.getName());
        theModel.addAttribute("items", mobileService.getMobiles());
        return "home";
    }

    @GetMapping("/access-denied")
    public String failHandler()
    {
        return "denied";
    }







}
