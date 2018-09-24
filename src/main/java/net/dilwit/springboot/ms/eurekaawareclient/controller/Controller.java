package net.dilwit.springboot.ms.eurekaawareclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

    @Value("${execution.delayInSeconds}")
    private int executionDelayInSeconds;

    @RequestMapping("/greeting")
    public String greeting() throws InterruptedException {

        LOGGER.info("EurekaAwareClient - greeting() invoked and processing delay: " + executionDelayInSeconds + " applied.");
        TimeUnit.SECONDS.sleep(executionDelayInSeconds);
        return "Hello from EurekaAwareClient!";
    }

}
