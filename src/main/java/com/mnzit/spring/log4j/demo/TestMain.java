package com.mnzit.spring.log4j.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggingEvent;

/**
 * @author Manjit Shakya <mnzitshakya@gmail.com>
 */
public class TestMain {
    public static void main (String [] args) {

        Logger l = Logger.getLogger("test");

        MyAppender app = new MyAppender();

        l.addAppender(app);

        l.warn("first");
        l.warn("second");
        l.warn("third");

        l.trace("fourth shouldn't be printed");

        for (LoggingEvent le: app.eventsList) {
            System.out.println("***" + le.getMessage());
        }
    }
}
