package com.balceda.demo.web.scopes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class SessionScopedBean implements Serializable {

    private static final long serialVersionUID = 1L;

    // Lifecycle Callbacks
    @PostConstruct
    public void init() {
        System.out.println("SessionScopedBean::init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("SessionScopedBean::destroy");
    }

    public int getHashCode() {
        return this.hashCode();
    }
}
