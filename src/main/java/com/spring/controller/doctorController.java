package com.spring.controller;

import com.spring.model.patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spring.Dao.patientRepo;


@RestController
public class doctorController {

    @Autowired
    private patientRepo repo;

    @PutMapping("/addreport")
    public void addReport(@RequestParam Long id  ,@RequestParam String report){
        patient p=new patient();
       p= repo.findpatientById(id);
       p.setReport(report);
       repo.save(p);
    }

    

}
