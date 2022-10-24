package com.example.springextensionpoint;

import com.example.springextensionpoint.initialize.TestApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringextensionpointApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringextensionpointApplication.class, args);
//        SpringApplication application = new SpringApplication(SpringextensionpointApplication.class);
//        application.addInitializers(new TestApplicationContextInitializer());
//        application.run(args);

//        System.out.println("123");
    }

}
