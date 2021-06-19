package com.example.accountproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping(value="/join_form")
    public String jogin_form()
    {

        System.out.println("asdas");

        return "join_form";
    }

}
