package net.dilwit.springboot.ms.eurekaawareclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaAwareClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaAwareClientApplication.class, args);
    }
}
