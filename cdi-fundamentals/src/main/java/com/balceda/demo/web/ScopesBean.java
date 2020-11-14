package com.balceda.demo.web;

import com.balceda.demo.stereotype.WebRequest;
import com.balceda.demo.web.scopes.ApplicationScopeBean;
import com.balceda.demo.web.scopes.DependentScopeBean;
import com.balceda.demo.web.scopes.RequestScopeBean;
import com.balceda.demo.web.scopes.SessionScopedBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.logging.Logger;

@WebRequest
public class ScopesBean implements Serializable {

    private static final long serialVersionUID = 1L;

    // Field injection
    @Inject
    private ApplicationScopeBean applicationScopeBean;

    @Inject
    private SessionScopedBean sessionScopedBean;

    @Inject
    private RequestScopeBean requestScopeBean;

    @Inject
    private DependentScopeBean dependentScopeBean;

    @Inject
    private Logger logger;

    // Lifecycle Callbacks
    @PostConstruct
    public void init() {
        logger.info("init::");
    }

    @PreDestroy
    public void destroy() {
        logger.info("destroy::");
    }

    public int applicationScopeHashCode() {
        return applicationScopeBean.getHashCode();
    }

    public int sessionScopeHashCode() {
        return sessionScopedBean.getHashCode();
    }

    public int requestScopeHashCode() {
        return requestScopeBean.getHashCode();
    }

    public int dependentScopeHashCode() {
        return dependentScopeBean.getHashCode();
    }
}
