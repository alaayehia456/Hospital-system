package com.spring.controller;

import com.spring.model.doctor;
import com.spring.model.patient;
import com.spring.service.mangerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spring.Dao.patientRepo;

import java.util.List;


@RestController
@Tag(name = "Doctor Controller",description = "Doctor Apis")
public class doctorController {

    @Autowired
    mangerService service;


    @Autowired
    private patientRepo repo;

    @PutMapping("/addreport")
    @Operation(description = "Add Report",summary = "Add Report",tags = "Doctor Controller")
    public void addReport(@RequestParam Long id  ,@RequestParam String report){
        patient p=new patient();
       p= repo.findpatientById(id);
       p.setReport(report);
       repo.save(p);
    }

    @PostMapping("/adddoctor")
    @Operation(description = "add doctor",summary = "add doctor",tags = "Doctor Controller")
    public void addDoctor(@RequestBody doctor d){
        service.addDoctor(d);
    }

    @DeleteMapping("/deletedoctor")
    @Operation(description = "delete doctor",summary = "delete doctor",tags = "Doctor Controller")
    public void deleteDoctor(@RequestParam Long id){
        service.deleteDoctor(id);
    }


    @PutMapping("editedoctor")
    @Operation(description = "edite information of doctor",summary = "edite  information of doctor  ",tags = "Doctor Controller")
    public void edtieDoctor(@RequestBody doctor d){
        service.editeDoctor(d);
    }

    @GetMapping("/getAllDoctor")
    @Operation(description = "Get All Doctor",summary = "Get All Doctor",tags = "Doctor Controller")
    public List<doctor> getAllDoctor(){

        return service.getAllDoctor();

    }




}
