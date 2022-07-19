package com.spring.service;

import com.spring.Dao.patientRepo;
import com.spring.model.bill;
import com.spring.model.doctor;
import com.spring.model.patient;
import javafx.util.converter.LocalDateTimeStringConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.spring.Dao.*;
@Service
public class mangerService {

    @Autowired
    patientRepo patientrepo;

    @Autowired
    private doctorRepo doctorrepo;
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

       p= patientrepo.findpatientById(id);

       LocalDateTime t=LocalDateTime.now();

       if(p.getRoom() != null){

           p.setCheckOut(t);

           patientrepo.save(p);


           int numberOfYear=p.getCheckIn().getYear() - p.getCheckOut().getYear();




           if(numberOfYear == 1){
               numberOfYear  = numberOfYear * 365;
           }else if(numberOfYear > 1){
               numberOfYear = numberOfYear -1;
               numberOfYear  = numberOfYear * 365;
           }


           int allMonths=p.getCheckOut().getMonth().getValue()-1;

           allMonths = allMonths * 30;

           int daysOfMonth=p.getCheckOut().getDayOfMonth();


           int allCost=(daysOfMonth + allMonths + numberOfYear ) * p.getRoom().getSalary();

           bill b=new bill();
           b.setTotal_price(allCost);
           b.setId_customer(p.getId());
           b.setPriceOfDay(p.getRoom().getSalary());


           p.setRoom(null);
           patientrepo.save(p);

           return b;


       }else {
           throw new RuntimeException("patient is cheaked out");
       }




    }

    public patient getPatient(Long id){
        return patientrepo.findpatientById(id);
    }


    public void addDoctor(doctor p){
        doctorrepo.save(p);
    }

    public void deleteDoctor(Long id){
        doctorrepo.deleteById(id);
    }


    public void editeDoctor(doctor d){

        doctor Doctor=doctorrepo.getById(d.getId());

        Doctor.setName(d.getName());
        Doctor.setMajor(d.getMajor());
        Doctor.setPatients(d.getPatients());
        Doctor.setSalary(d.getSalary());
        Doctor.setAge(d.getAge());
        Doctor.setAcademicAndCareerProgression(d.getAcademicAndCareerProgression());
        Doctor.setPhoneNumber(d.getPhoneNumber());
        doctorrepo.save(Doctor);

    }


}
