package com.mnzit.spring.log4j.demo.test1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Manjit Shakya
 * @email manjit.shakya@f1soft.com
 */
@Slf4j
public class Test1 {

    public void test() {
        log.error("This is an error message for log4j");
        log.debug("This is an debug message for log4j");
        log.warn("This is a warning message for log4j");
        log.info("This is an info message for log4j");
    }
}
