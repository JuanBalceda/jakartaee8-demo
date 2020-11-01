package com.balceda.demo.web;

import com.balceda.demo.stereotype.WebView;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

// @Named
// @ViewScoped
@WebView
public class ViewScopeBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private SessionScopedBean sessionScopedBean;

    @Inject
    private RequestScopeBean requestScopeBean;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
