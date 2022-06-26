package com.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class doctor extends Human{


    @Enumerated(EnumType.ORDINAL)
    @JsonIgnore
    private doctorMajor major;

    @Column
    private int salary;


    @Enumerated(EnumType.ORDINAL)
private academicAndCareerProgression academicAndCareerProgression;


    @OneToMany(mappedBy = "Doctor")
    @JsonIgnore
    private List<patient> patients=new ArrayList<>();



}
