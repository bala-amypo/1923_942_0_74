package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Stuentity;

@repository
public interface Studentrepo extends JpaRepository<StuEnt, Long> {
    
    
}