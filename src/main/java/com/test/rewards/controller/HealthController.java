package com.test.rewards.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@ConfigurationProperties()
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public ResponseEntity health() {

        return new ResponseEntity(HttpStatus.OK);
    }
}
