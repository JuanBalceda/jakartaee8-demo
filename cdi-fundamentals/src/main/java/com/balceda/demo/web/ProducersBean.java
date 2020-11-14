package com.balceda.demo.web;

import com.balceda.demo.qualifier.CitiesProvider;
import com.balceda.demo.stereotype.WebRequest;

import javax.inject.Inject;
import java.util.List;
import java.util.logging.Logger;

@WebRequest
public class ProducersBean {

    @Inject
    private Logger logger;

    @Inject
    @CitiesProvider
    private List<String> cities;

    public String getCities() {
        logger.info("getCities::");
        return cities.toString();
    }
}
