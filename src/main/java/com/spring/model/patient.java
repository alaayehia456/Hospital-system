package com.spring.model;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class patient extends Human{

    @Column
    private String report;

    @Column
    private Date checkIn;

    @Column
    private Date checkOut;



    @OneToOne
    @JoinColumn(name = "room_id")
    private room  Room;

    @ManyToOne
    @JoinColumn(name = "ID_DOCTOR",nullable = false)
    private doctor  Doctor;




}
