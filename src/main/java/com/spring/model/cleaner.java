package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class cleaner extends Human{

    @Column
    private int salary;




    @ManyToMany(mappedBy = "cleaners")
    private List<room> Room=new ArrayList<>();

}
