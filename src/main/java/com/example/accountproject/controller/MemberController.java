package com.example.accountproject.controller;


import com.example.accountproject.documents.MemberDTO;
import com.example.accountproject.models.interfaces.MemberSv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {


    @Autowired
    private MemberSv memberSv;

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String membersave(MemberDTO memberDTO)
    {

        memberSv.membersave(memberDTO);
        return "join_form";
    }

    @GetMapping("/getMember")
    public ModelAndView getMember()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("memberList");
        mv.addObject("data", memberSv.findAll());
        return mv;
    }

   @GetMapping("/getMember/{id}")
   public ModelAndView getMember(
           @PathVariable String id
   )
   {
       ModelAndView mv = new ModelAndView();

       List result = new ArrayList();
       memberSv.findById(id).ifPresent(result::add);

       mv.setViewName("memberList");
       mv.addObject("data", result);
       return mv;
   }


}
