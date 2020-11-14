package com.balceda.demo.event;

import com.balceda.demo.qualifier.Admin;
import com.balceda.demo.qualifier.PopularStand;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.ObservesAsync;
import javax.enterprise.event.Reception;
import javax.enterprise.event.TransactionPhase;
import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;

@RequestScoped
public class EventObserver {

    @Inject
    private Logger logger;

    public void plainEvent(@ObservesAsync EventData eventData) {
        logger.log(Level.INFO, "User {0} logged in at {1}.", new Object[]{eventData.getEmail(), eventData.getLoginDate()});

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, null, e);
        }
    }

    public void popularEvent(@ObservesAsync @PopularStand EventData eventData) {
        logger.log(Level.INFO, "Popular user {0} logged in at {1}.", new Object[]{eventData.getEmail(), eventData.getLoginDate()});
    }

    public void conditionalObserver(@Observes(notifyObserver = Reception.IF_EXISTS, during = TransactionPhase.AFTER_COMPLETION) @Admin EventData eventData) {
        logger.log(Level.INFO, "Admin user {0} logged in at {1}.", new Object[]{eventData.getEmail(), eventData.getLoginDate()});

    }

    public void asyncConditionalObserver(@ObservesAsync(notifyObserver = Reception.IF_EXISTS) @Admin EventData eventData) {
        logger.log(Level.INFO, "Admin user {0} logged in at {1}.", new Object[]{eventData.getEmail(), eventData.getLoginDate()});
    }
}
