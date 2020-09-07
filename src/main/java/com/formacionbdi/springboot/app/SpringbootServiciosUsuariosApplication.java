package com.formacionbdi.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.formacionbdi.springboot.app.models.entity")
public class SpringbootServiciosUsuariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServiciosUsuariosApplication.class, args);
    }

}
