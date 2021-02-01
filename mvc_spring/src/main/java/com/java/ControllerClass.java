package com.java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerClass {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String methodhandeler(Model model){
        model.addAttribute("message", "this is my first in mvc spring");
        return "hello";
    }
    
}