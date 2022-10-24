package com.example.springextensionpoint.commandLineRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author think
 * @date 2022年10月24日 10:40
 */
@Component
@Order(2)
public class TestCommandLineRunner2 implements CommandLineRunner {
    Logger log = LoggerFactory.getLogger(TestCommandLineRunner2.class);
    @Override
    public void run(String... args) throws Exception {
        log.info("[TestCommandLineRunner] 2");
    }
}
