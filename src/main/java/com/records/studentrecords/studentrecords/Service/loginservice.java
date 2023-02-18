package com.records.studentrecords.studentrecords.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.records.studentrecords.studentrecords.Model.login_info;

@Service
public class loginservice {
    List<login_info> loginstoreservice = new ArrayList<>();
    public List<login_info> getlogin(){
        return this.loginstoreservice;
    }
    public void addlogin(login_info addinglogin){
        loginstoreservice.add(addinglogin);
    }
}
