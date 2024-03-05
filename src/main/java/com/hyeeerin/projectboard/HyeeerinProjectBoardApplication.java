package com.hyeeerin.projectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class HyeeerinProjectBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HyeeerinProjectBoardApplication.class, args);
    }

}
