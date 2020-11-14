package com.balceda.demo.web;

import com.balceda.demo.stereotype.WebView;
import com.balceda.demo.web.scopes.RequestScopeBean;

import javax.inject.Inject;

import java.io.Serializable;

@WebView
public class QualifiersBean implements Serializable {

    private static final long serialVersionUID = -7873662893904909810L;

    @Inject
    private RequestScopeBean requestScopeBean;

    public String greeting() {
        return requestScopeBean.greeting();
    }
}
