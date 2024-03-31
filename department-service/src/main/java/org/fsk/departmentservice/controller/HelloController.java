package org.fsk.departmentservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${project.description}")
    private String projectDescription;

    @GetMapping("/config-test")
    public String getConfigValue() {
        return projectDescription;
    }
}
