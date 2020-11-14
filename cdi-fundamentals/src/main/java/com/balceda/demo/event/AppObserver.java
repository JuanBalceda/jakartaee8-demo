package com.balceda.demo.event;

import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import static javax.interceptor.Interceptor.Priority.*;

import java.util.logging.Logger;

@ApplicationScoped
public class AppObserver {

    @Inject
    private Logger logger;

    private final String greeting = "Hello,";

    public void greeting1(@Observes @Priority(APPLICATION) String name) {
        logger.info("Lower priority: " + greeting + " " + name);
    }

    public void greeting2(@Observes @Priority(100) String name) {
        logger.info("Higher priority: " + greeting + " " + name);
    }
}
