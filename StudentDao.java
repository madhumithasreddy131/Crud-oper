package com.example.week8a;

import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentDao extends JpaRepository<com.example.week8a.Student,Integer> {
}