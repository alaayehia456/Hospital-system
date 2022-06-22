package com.spring.Dao;

import com.spring.model.built;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface builtRepo extends JpaRepository<built,Long> {
}
