package com.tinkeraft.referential;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReferentialApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReferentialApplication.class, args);
    }

}
