package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = {AopAutoConfiguration.class})
public class CydeoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CydeoApplication.class, args);
    }

/* I can access that controller on the localhost:8080, also when I run this runner class,
	There will be info like that "Tom started on port(s) 8080".
	This means that I can check what I did in that port*/
}