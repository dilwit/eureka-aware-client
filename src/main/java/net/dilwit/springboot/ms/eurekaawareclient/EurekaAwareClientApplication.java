package net.dilwit.springboot.ms.eurekaawareclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaAwareClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaAwareClientApplication.class, args);
    }
}
