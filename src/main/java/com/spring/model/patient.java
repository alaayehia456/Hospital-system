package com.spring.model;




import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class patient extends Human{

    @Column
    private String report;

    @Column
    private LocalDateTime checkIn;

    @Column
    private LocalDateTime checkOut;



    @OneToOne
    @JoinColumn(name = "room_id")
    //@JsonIgnore
    private room  Room;

    @ManyToOne
    @JoinColumn(name = "ID_DOCTOR",nullable = false)
  //  @JsonIgnore
    private doctor  Doctor;




}
