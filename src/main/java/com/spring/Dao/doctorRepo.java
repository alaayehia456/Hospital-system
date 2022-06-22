package com.spring.Dao;

import com.spring.model.doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface doctorRepo extends JpaRepository<doctor,Long> {
}
