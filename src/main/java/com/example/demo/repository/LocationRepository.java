package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location,Integer> {

}
