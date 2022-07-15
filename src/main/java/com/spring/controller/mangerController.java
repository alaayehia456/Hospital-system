package com.spring.controller;

import com.spring.model.bill;
import com.spring.model.patient;
import com.spring.service.mangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spring.model.*;
import java.util.List;
import com.spring.service.*;
@RestController
@RequestMapping("/api")
public class mangerController {

    @Autowired
    mangerService service;




//http://localhost:8080/api/patient/add
    @PostMapping("/patient/add")
    public void addPatient(@RequestBody patient p){

    service.addPatient(p);

}


    //http://localhost:8080/api/patient/get
    @GetMapping("/patient/get")
    public List<patient> getAllPatents(){

        return service.getAllPatient();
    }
    //http://localhost:8080/api/patient/getbill?id=1
    @GetMapping("/patient/getbill")
    public bill getBillAndCheckOut(@RequestParam Long id){


    return service.getTheBill(id);


    }

        @GetMapping("/getpatient")
    public patient getPatient(@RequestParam Long id){
       return   service.getPatient(id);
    }


    @PostMapping("/adddoctor")
    public void addDoctor(@RequestBody doctor d){
        service.addDoctor(d);
    }

    @DeleteMapping("/deletedoctor")
    public void deleteDoctor(@RequestParam Long id){
        service.deleteDoctor(id);
    }


    @PutMapping("editedoctor")
    public void edtieDoctor(@RequestBody doctor d){
        service.editeDoctor(d);
    }

}
