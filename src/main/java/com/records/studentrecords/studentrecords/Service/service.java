package com.records.studentrecords.studentrecords.Service;
import com.records.studentrecords.studentrecords.Model.Student_info;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class service {
    List<Student_info> infos = new ArrayList<Student_info>();

    public List<Student_info> getinfo(){
        return this.infos;
    }
    public void addinfo(Student_info modeldabba){
        infos.add(modeldabba);
    }
}
