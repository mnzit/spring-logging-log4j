package com.mnzit.spring.log4j.demo;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Manjit Shakya <mnzitshakya@gmail.com>
 */
@Component
public class SslErrorSecurityAppender extends AppenderSkeleton implements ApplicationContextAware {

    @Override
    protected void append(LoggingEvent loggingEvent) {

    }

Override
    public void close() {

    }

    @Override
    public boolean requiresLayout() {
        return false;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
