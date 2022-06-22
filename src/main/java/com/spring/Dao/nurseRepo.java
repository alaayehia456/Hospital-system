package com.spring.Dao;

import com.spring.model.nurse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface nurseRepo extends JpaRepository<nurse,Long> {
}
