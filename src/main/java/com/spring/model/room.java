package com.spring.model;

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
    private patient Patient;


    @ManyToMany(mappedBy = "Room")
   private List<nurse> Nurse=new ArrayList<>();


    @ManyToOne
    @JoinColumn(name = "built_id")
   private built Built;


    @ManyToMany
    @JoinTable( name = "room_cleaner",
            joinColumns=@JoinColumn(name = "room_id"),
            inverseJoinColumns = @JoinColumn(name = "cleaner_id")
    )
    private List<cleaner> cleaners=new ArrayList<>();

}
