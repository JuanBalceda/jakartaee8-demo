package com.balceda.demo.web.scopes;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class SessionScopedBean implements Serializable {

    private static final long serialVersionUID = -7187450879555291265L;
}
