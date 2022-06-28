package com.vinaykumarkare.mobilestore.controller;

import com.vinaykumarkare.mobilestore.converter.MobilesConverter;
import com.vinaykumarkare.mobilestore.dto.MobilesDTO;
import com.vinaykumarkare.mobilestore.service.MobileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/staff")
public class StaffDataController {



    @Autowired
    private MobileService mobileServiceObject;

    @Autowired
    private MobilesConverter mobilesConverter;

    

    @GetMapping("/stockList")
    public String stockList(Model theModel) {
        try {
            theModel.addAttribute("allItems", mobileServiceObject.getMobiles());
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }

        return "stock-list";
    }

    @PostMapping("/deleteItem")
    public ModelAndView deleteItem(@RequestParam int id) {
        mobileServiceObject.deleteById(id);
        return new ModelAndView("redirect:/successHandler");
    }

    @GetMapping("/addItem")
    public String addNewItem()
    {
        return "item-form";
    }

    @PostMapping("/saveItem")
    public ModelAndView saveNewItem(@ModelAttribute("item") MobilesDTO mobile)
    {
        mobileServiceObject.saveMobile(mobilesConverter.dtoToEntity(mobile));
        return new ModelAndView("redirect:/successHandler");
    }

    @PostMapping("/updateItem")
    public String updateItem(@RequestParam("itemId") int itemId, Model model) {
        model.addAttribute("item", mobilesConverter.entityToDto(mobileServiceObject.getMobileById(itemId)));
        return "item-update";
    }


}
