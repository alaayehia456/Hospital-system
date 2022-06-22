package com.spring.Dao;

import com.spring.model.cleaner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cleanerRepo  extends JpaRepository<cleaner,Long> {
}
