package com.amulya.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.amulya.portfolio.entity.Project;
import com.amulya.portfolio.service.ProjectService;

@RestController
@RequestMapping("/api/projects")
<<<<<<< HEAD
@CrossOrigin(origins = {
    "http://localhost:3000",
    "https://portfolio-frontend-rose-one.vercel.app"
})
=======
@CrossOrigin(origins = "http://localhost:3000")
>>>>>>> 1f2f4357043a8d94de0c4f89893cd0f989c0ee2b
public class ProjectController {

    @Autowired
    private ProjectService service;

    @GetMapping
    public List<Project> getProjects() {
        return service.getAllProjects();
    }
}