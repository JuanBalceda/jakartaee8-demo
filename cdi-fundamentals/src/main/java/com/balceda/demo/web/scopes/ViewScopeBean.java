package com.balceda.demo.web.scopes;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ViewScopeBean implements Serializable {

    private static final long serialVersionUID = -1457402838910652911L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
