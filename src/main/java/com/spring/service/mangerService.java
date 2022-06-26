package com.spring.service;

import com.spring.Dao.patientRepo;
import com.spring.model.bill;
import com.spring.model.patient;
import javafx.util.converter.LocalDateTimeStringConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class mangerService {

    @Autowired
    patientRepo patientrepo;
    //add patient
    public void addPatient(patient p){
    LocalDateTime d=LocalDateTime.now();
    p.setCheckIn(d);
    patientrepo.save(p);

}

    //get all patient
    public List<patient> getAllPatient(){

        return patientrepo.findAll();
    }

    //cheak out method

    public bill getTheBill(Long id){


        patient p=new patient();

       p= patientrepo.getAllById(id);

       LocalDateTime t=LocalDateTime.now();

       p.setCheckOut(t);
       patientrepo.save(p);

       int getAllDaysInYears=p.getCheckIn().getYear()-p.getCheckOut().getYear();

       int getAllDaysInMonth=p.getCheckIn().getMonthValue()-p.getCheckOut().getMonthValue();

       int getAllDayInFirstMonthAndEndMonth=(p.getCheckIn().getDayOfMonth() - 30) + (p.getCheckOut().getDayOfMonth()-30);

       int dayOfPrice=p.getRoom().getSalary();

       float totalPrice = (getAllDayInFirstMonthAndEndMonth + getAllDaysInMonth + getAllDaysInYears) * dayOfPrice;
System.out.println(getAllDaysInYears);
        System.out.println(getAllDaysInMonth);
        System.out.println(getAllDayInFirstMonthAndEndMonth);

       bill b=new bill();
       b.setId_customer(id);
       b.setPriceOfDay(dayOfPrice);
       b.setTotal_price(totalPrice);
       return b;

    }

}
