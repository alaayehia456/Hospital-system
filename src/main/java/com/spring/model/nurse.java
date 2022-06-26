package com.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class nurse extends Human{


    @Column
    private int salary;





    @ManyToMany
    @JoinTable(
            name = "room_nurses",
            joinColumns = @JoinColumn(name = "nurse_id"),
            inverseJoinColumns = @JoinColumn(name = "room_id")
    )
    @JsonIgnore
    private List<room> Room=new ArrayList<>();

}
