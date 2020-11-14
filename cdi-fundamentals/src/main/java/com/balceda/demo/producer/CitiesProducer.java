package com.balceda.demo.producer;

import com.balceda.demo.qualifier.CitiesProvider;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.logging.Logger;

public class CitiesProducer {

    @Inject
    private EntityManager entityManager;

    @Inject
    private Logger logger;

    @Produces
    @CitiesProvider
    public List<String> getCities() {
        logger.info("getCities::");

        return List.of("Lima", "Barcelona");
    }

    public void dispose(@Disposes @CitiesProvider List<String> cities) {
        logger.info("dispose::");
        cities = null;
    }
}
