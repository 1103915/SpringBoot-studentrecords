package com.records.studentrecords.studentrecords.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.records.studentrecords.studentrecords.Model.Student_info;
import com.records.studentrecords.studentrecords.Model.login_info;
import com.records.studentrecords.studentrecords.Service.loginservice;
import com.records.studentrecords.studentrecords.Service.service;


@Controller
public class HomeController {
   @Autowired
   service s1;
   loginservice first_Loginservice; 
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
    @GetMapping("/loginpage")
    public String myloginpage(Model model){
        
        model.addAttribute("loginatt",new login_info());
        return "myloginpage";
    }
    @PostMapping("/studentlist")
    String postdata(@ModelAttribute login_info info){
        first_Loginservice.addlogin(info);
        return "redirect:/home";

    }
    
  }
