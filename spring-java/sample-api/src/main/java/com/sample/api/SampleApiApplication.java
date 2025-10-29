package com.sample.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories(basePackages = "com.sample.library")
public class SampleApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SampleApiApplication.class, args);
    }
}
