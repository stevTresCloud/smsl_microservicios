package com.smsl.msa.plansuscripcion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PlanSuscripcionApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlanSuscripcionApplication.class, args);
    }

}
