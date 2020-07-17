package com.mnzit.spring.log4j.demo;

import com.mnzit.spring.log4j.demo.test1.Test1;
import com.mnzit.spring.log4j.demo.test2.Test2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringLog4jDemo {

    public static void main(String[] args) {
        SpringApplication.run(SpringLog4jDemo.class, args);

        while (true) {

            log.error("This is an error message for log4j");
            log.debug("This is an debug message for log4j");
            log.warn("This is a warning message for log4j");
            log.info("This is an info message for log4j");

            new Test1().test();
            new Test2().test();
        }
    }
}
