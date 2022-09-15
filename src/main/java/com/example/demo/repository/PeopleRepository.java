package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.models.People;

@Repository
public interface PeopleRepository extends JpaRepository<People,Integer> {

	List<People> findByLocationId(Integer id);
}
