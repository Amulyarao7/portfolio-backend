package com.amulya.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amulya.portfolio.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}