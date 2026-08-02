package com.amulya.portfolio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amulya.portfolio.entity.Project;
import com.amulya.portfolio.repository.ProjectRepository;

@Service
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public List<Project> getAllProjects() {
        return repository.findAll();
    }
}