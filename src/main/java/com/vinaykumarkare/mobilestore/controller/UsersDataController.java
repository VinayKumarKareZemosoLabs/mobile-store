package com.vinaykumarkare.mobilestore.controller;

import com.vinaykumarkare.mobilestore.converter.MobilesConverter;
import com.vinaykumarkare.mobilestore.entity.Customer;
import com.vinaykumarkare.mobilestore.entity.Mobiles;
import com.vinaykumarkare.mobilestore.service.MobileService;
import com.vinaykumarkare.mobilestore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UsersDataController {


    @Autowired
    private UserService usersService;

    @Autowired
    private MobileService mobileService;


    @Autowired
    private MobilesConverter mobilesConverter;



    @GetMapping("/ordersList")
    public String ordersList(Principal loginUser, Model theModel) {
        theModel.addAttribute("currentUser", loginUser.getName());
        theModel.addAttribute("orderedItems", mobilesConverter.entityToDto(usersService.getOrdersList(loginUser.getName())));
        return "orders-list";
    }

    @PostMapping("/orderItem")
    public ModelAndView orderItem(@RequestParam String itemId, Principal loggedUser) {
        Customer user = usersService.findByUsername(loggedUser.getName());
        Mobiles item = mobileService.getMobileById(Integer.parseInt(itemId));
        user.addItem(item);
        mobileService.saveMobile(item);
        return new ModelAndView("redirect:/successHandler");
    }

    @PostMapping("/deleteOrder")
    public ModelAndView deleteItem(@RequestParam int id, Principal loggedUser) {
        Customer user = usersService.findByUsername(loggedUser.getName());
        Mobiles item = mobileService.getMobileById(id);
        user.getMobiles().remove(item);
        mobileService.saveMobile(item);
        return new ModelAndView("redirect:/user/ordersList");
    }


}
