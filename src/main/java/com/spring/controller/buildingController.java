package com.spring.controller;


import com.spring.service.mangerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spring.model.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Tag(name = "building controller ", description = "building Apis")
public class buildingController {

    @Autowired
    private mangerService service;


    @GetMapping("/allBuilding")
    @Operation(description = "get all building",summary = "get all building",tags = "building controller ")
    public List<built> getAllBilding(){
        return service.getAllBuilding();
    }

    @PostMapping("/addBuilding")
    @Operation(description = "add  building",summary = "add building",tags = "building controller ")
    public void addBuilding(@RequestBody built b){
        service.addBuilding(b);
    }

    @PutMapping("/editeBuilding")
    @Operation(description = "get building by id",summary = "get building by id",tags = "building controller ")
    public void editeBuilding(@RequestBody built v){
        service.updateBuilding(v);
    }

    @GetMapping("/getBuildById")
    public Optional<built> getBuilById(@RequestParam Long id){
      return   service.getBuiltById(id);
    }




}
