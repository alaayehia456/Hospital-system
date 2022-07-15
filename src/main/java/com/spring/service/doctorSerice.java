package com.spring.service;

import com.spring.model.patient;
import org.springframework.beans.factory.annotation.Autowired;
import com.spring.Dao.*;

public class doctorSerice {

    @Autowired
    private patientRepo doctorrepo;


    public void setReport(Long id,String report){
        patient p=new patient();

        p= doctorrepo.findpatientById(id);
        p.setReport(report);
        doctorrepo.save(p);

    }




}
