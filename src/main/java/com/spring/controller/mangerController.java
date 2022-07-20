package com.spring.controller;

import com.spring.model.bill;
import com.spring.model.patient;
import com.spring.service.mangerService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spring.model.*;
import java.util.List;
import com.spring.service.*;
@RestController
@RequestMapping("/api")
@Api(value = "manger" )
@Tag(name = "manger layer",description = "Manger apis")
public class mangerController {

    @Autowired
    mangerService service;




//http://localhost:8080/api/patient/add
    @PostMapping("/patient/add")

    @Operation(description = "save patient",summary = "save patient ",tags = "manger layer")
    public void addPatient(@RequestBody patient p){

    service.addPatient(p);

}


    //http://localhost:8080/api/patient/get
    @GetMapping("/patient/get")
    @Operation(description = "get all  patient",summary = "get all patient ",tags = "manger layer")
    public List<patient> getAllPatents(){

        return service.getAllPatient();
    }
    //http://localhost:8080/api/patient/getbill?id=1
    @GetMapping("/patient/getbill")
    @Operation(description = "get bill of patient ",summary = "get bill of patient  ",tags = "manger layer")
    public bill getBillAndCheckOut(@RequestParam Long id){


    return service.getTheBill(id);


    }

        @GetMapping("/getpatient")
        @Operation(description = "get all patient",summary = "get all  patient  ",tags = "manger layer")
    public patient getPatient(@RequestParam Long id){
       return   service.getPatient(id);
    }






}
