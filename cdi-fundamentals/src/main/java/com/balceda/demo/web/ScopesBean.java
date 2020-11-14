package com.balceda.demo.web;

import com.balceda.demo.stereotype.WebView;
import com.balceda.demo.web.scopes.ApplicationScopeBean;
import com.balceda.demo.web.scopes.DependentScopeBean;
import com.balceda.demo.web.scopes.RequestScopeBean;
import com.balceda.demo.web.scopes.SessionScopedBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.logging.Logger;

@WebView
public class ScopesBean implements Serializable {

    private static final long serialVersionUID = 218245158604860411L;

    // Field injection
    @Inject
    private ApplicationScopeBean applicationScopeBean;

    @Inject
    private SessionScopedBean sessionScopedBean;

    @Inject
    private RequestScopeBean requestScopeBean;

    @Inject
    private DependentScopeBean dependentScopeBean;


    // Lifecycle Callbacks

    @PostConstruct
    public void init() {
        System.out.println("SessionScopedBean::init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("SessionScopedBean::destroy");
    }
}
