package com.spring.Dao;

import com.spring.model.patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface patientRepo  extends JpaRepository<patient,Long> {

    @Query("select u from patient u where u.id=?1")
    public patient findpatientById(@Param("id") Long id);

}
