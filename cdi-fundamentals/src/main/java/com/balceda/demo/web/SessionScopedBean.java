package com.balceda.demo.web;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class SessionScopedBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @PostConstruct
    public void init() {
        System.out.println("SessionScopedBean::init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("SessionScopedBean::destroy");
    }
}
