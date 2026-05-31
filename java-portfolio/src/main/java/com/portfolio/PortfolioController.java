package com.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Jayachandran R");
        model.addAttribute("title", "Full Stack Java Developer");
        model.addAttribute("about", "Passionate Java developer with 3+ years of experience building scalable web applications using Spring Boot, REST APIs, and cloud deployments.");

        model.addAttribute("skills", List.of(
            "Java", "Spring Boot", "REST APIs", "MySQL",
            "Git & GitHub", "Docker", "AWS", "JavaScript"
        ));

        model.addAttribute("projects", List.of(
            new Project("E-Commerce Platform", "Full-stack shopping app with Spring Boot backend, MySQL DB, and REST APIs. Handles 10k+ daily users.", "Java, Spring Boot, MySQL, Thymeleaf"),
            new Project("Task Manager API", "RESTful API with JWT authentication, CRUD operations, and Swagger docs. Deployed on AWS EC2.", "Java, Spring Boot, JWT, Swagger"),
            new Project("Weather Dashboard", "Real-time weather app consuming OpenWeatherMap API with custom caching layer.", "Java, Spring Boot, REST API, JavaScript")
        ));

        return "index";
    }

    public record Project(String name, String description, String tech) {}
}
