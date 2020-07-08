package com.mnzit.spring.log4j.demo;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

import java.util.ArrayList;

/**
 * @author Manjit Shakya <mnzitshakya@gmail.com>
 */
public class MyAppender extends AppenderSkeleton {
    ArrayList<LoggingEvent> eventsList = new ArrayList();

    @Override
    protected void append(LoggingEvent loggingEvent) {
        eventsList.add(loggingEvent);
    }

    @Override
    public void close() {

    }

    @Override
    public boolean requiresLayout() {
        return false;
    }
}
