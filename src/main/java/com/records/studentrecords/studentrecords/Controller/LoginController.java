package com.records.studentrecords.studentrecords.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.records.studentrecords.studentrecords.Model.login_info;
import com.records.studentrecords.studentrecords.Service.loginservice;

@Controller
public class LoginController {
    @Autowired
    loginservice first_Loginservice;
    @GetMapping("/loginpage")
    public String myloginpage(Model model){
        
        model.addAttribute("loginatt",new login_info());
        return "myloginpage";
    }
    @PostMapping("/list")
    String postdata(@ModelAttribute login_info info){
        first_Loginservice.addlogin(info);
        return "redirect:/home";

    }
}
