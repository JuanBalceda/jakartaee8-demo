package com.balceda.demo.web;

import com.balceda.demo.event.EventData;
import com.balceda.demo.event.User;
import com.balceda.demo.qualifier.Admin;
import com.balceda.demo.qualifier.PopularStand;
import com.balceda.demo.stereotype.WebRequest;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.concurrent.CompletionStage;
import java.util.logging.Logger;

@WebRequest
public class EventsBean implements Serializable {

    private static final long serialVersionUID = 1292184070727597719L;

    @Inject
    private User user;

    @Inject
    private Logger logger;

    @Inject
    private Event<EventData> loginEvent;

    @Inject
    @PopularStand
    private Event<EventData> popularEvent;

    @Inject
    @Admin
    private Event<EventData> adminEvent;

    @Inject
    private Event<String> greetingEvent;

    public void login() {
        logger.info("login::");

        /*
        loginEvent.fire(new EventData(user.getEmail(), LocalDateTime.now()));
        popularEvent.fire(new EventData(user.getEmail(), LocalDateTime.now()));
        adminEvent.fire(new EventData(user.getEmail(), LocalDateTime.now()));
        */

        CompletionStage<EventData> fireAsync = loginEvent.fireAsync(new EventData(user.getEmail(), LocalDateTime.now()));
        fireAsync.whenComplete((eventData, throwable) -> {
            logger.info("Hello " + eventData.getEmail() + ". Logging completed");
        });

        popularEvent.fireAsync(new EventData(user.getEmail(), LocalDateTime.now()));
        adminEvent.fireAsync(new EventData(user.getEmail(), LocalDateTime.now()));

        greetingEvent.fire("Juan");
/*
        LocalDateTime now = LocalDateTime.now();
        logger.info("");
        */
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
