package com.records.studentrecords.studentrecords.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.records.studentrecords.studentrecords.Model.Student_info;

import com.records.studentrecords.studentrecords.Service.service;


@Controller
public class HomeController {
   @Autowired
   service s1; 
    @GetMapping("/home")
    public ModelAndView viewstudents(){
      ModelAndView myModelAndView = new ModelAndView("studentlist");
      myModelAndView.addObject("students",s1.getinfo());  
      return myModelAndView;
    }
    @GetMapping("/studentform")
    String form(Model model){
       
       model.addAttribute("information",new Student_info());
        return "studentform";
    }
    @PostMapping("/studentlist")
    String processed_data(@ModelAttribute Student_info poststudent){
        s1.addinfo(poststudent);
        return "redirect:/home";
    }
  
    
  }
