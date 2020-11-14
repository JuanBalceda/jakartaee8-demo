package com.balceda.demo.web.scopes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.Dependent;
import java.io.Serializable;

// Dependent scope bean by default
// @Dependent
public class DependentScopeBean implements Serializable {
    private static final long serialVersionUID = 1L;

    // Lifecycle Callbacks
    @PostConstruct
    public void init() {
        System.out.println("DependentScopeBean::init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DependentScopeBean::destroy");
    }

    public int getHashCode() {
        return this.hashCode();
    }
}
