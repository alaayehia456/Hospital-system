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
public class room {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column
    private int salary;


   @OneToOne(mappedBy = "Room")
   @JsonIgnore
    private patient Patient;


    @ManyToMany(mappedBy = "Room")
    @JsonIgnore
   private List<nurse> Nurse=new ArrayList<>();


    @ManyToOne
    @JoinColumn(name = "built_id")
    @JsonIgnore
   private built Built;


    @ManyToMany
    @JoinTable( name = "room_cleaner",
            joinColumns=@JoinColumn(name = "room_id"),
            inverseJoinColumns = @JoinColumn(name = "cleaner_id")
    )
    @JsonIgnore
    private List<cleaner> cleaners=new ArrayList<>();

}
