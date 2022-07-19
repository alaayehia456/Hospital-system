package com.spring.Dao;

import com.spring.model.doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface doctorRepo extends JpaRepository<doctor,Long> {

   // @Query("select u from doctor u where u .id=?1")
    //public Optional<doctor> finddoctorsById(@Param("id") Long id);
}
