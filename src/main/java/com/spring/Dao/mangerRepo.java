package com.spring.Dao;

import com.spring.model.manger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mangerRepo extends JpaRepository<manger,Long> {
}
