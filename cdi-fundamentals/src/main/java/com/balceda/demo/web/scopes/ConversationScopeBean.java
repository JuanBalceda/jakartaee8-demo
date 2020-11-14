package com.balceda.demo.web.scopes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ConversationScoped;
import java.io.Serializable;

@ConversationScoped
public class ConversationScopeBean implements Serializable {

    private static final long serialVersionUID = 1L;

    // Lifecycle Callbacks
    @PostConstruct
    public void init() {
        System.out.println("ConversationScopeBean::init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ConversationScopeBean::destroy");
    }
}
