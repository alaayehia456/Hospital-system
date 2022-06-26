package com.spring.Dao;

import com.spring.model.patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface patientRepo  extends JpaRepository<patient,Long> {

    public patient getAllById(@Param("id") Long id);

}
