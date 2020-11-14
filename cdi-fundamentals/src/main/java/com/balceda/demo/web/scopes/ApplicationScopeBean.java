package com.balceda.demo.web.scopes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ApplicationScopeBean {

    // Lifecycle Callbacks
    @PostConstruct
    public void init() {
        System.out.println("ApplicationScopeBean::init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ApplicationScopeBean::destroy");
    }

    public int getHashCode() {
        return this.hashCode();
    }
}
