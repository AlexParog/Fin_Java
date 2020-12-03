package com.springio.bibik2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Bibik2Application {

    public static void main(String[] args) {
        SpringApplication.run(Bibik2Application.class, args);
    }

}
