package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class doctor extends Human{

    @Column
private doctorMajor major;

    @Column
private int salary;

    @Column
private academicAndCareerProgression academicAndCareerProgression;


    @OneToMany(mappedBy = "Doctor")
    private List<patient> patients=new ArrayList<>();



}
