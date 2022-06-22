package com.spring.Dao;

import com.spring.model.room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface roomRepo extends JpaRepository<room,Long> {
}
