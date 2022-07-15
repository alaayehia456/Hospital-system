package com.spring.Dao;

import com.spring.model.doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface doctorRepo extends JpaRepository<doctor,Long> {

    @Query("select u from doctor u where patient .id=?1")
    public doctor finddoctorById(@Param("id") Long id);
}
