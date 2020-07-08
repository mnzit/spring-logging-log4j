package com.mnzit.spring.log4j.demo;

import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.LoggingEvent;

/**
 * @author Manjit Shakya <mnzitshakya@gmail.com>
 */
public class CustomLogLayout extends PatternLayout {

    @Override
    public String format(LoggingEvent event) {
        return super.format(event);
    }
}
