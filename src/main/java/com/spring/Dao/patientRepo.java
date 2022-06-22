package com.spring.Dao;

import com.spring.model.patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface patientRepo  extends JpaRepository<patient,Long> {
}
