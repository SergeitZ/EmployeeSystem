package com.careerdevs.EmployeeSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class EmployeeSystem {

    private final AtomicLong counter = new AtomicLong();
    HeroNames names = new HeroNames();

    @GetMapping("/")
    public String welcomeMessage() {
        return "Welcome to the Employee Database";
    }

    @GetMapping("/dummy")
    public Employee getDummyEmployee() {
        return new Employee(999, "Insert first name", "Insert last name");
    }

    @GetMapping("/random")
    public Employee getRandomEmployee() {
        return new Employee(counter.incrementAndGet(), names.generateFirst(), names.generateLast());
    }

}
