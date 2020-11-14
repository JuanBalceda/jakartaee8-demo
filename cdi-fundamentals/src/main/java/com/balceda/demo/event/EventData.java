package com.balceda.demo.event;

import java.time.LocalDateTime;

public class EventData {
    private String email;
    private LocalDateTime loginDate;

    public EventData() {
    }

    public EventData(String email, LocalDateTime loginDate) {
        this.email = email;
        this.loginDate = loginDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(LocalDateTime loginDate) {
        this.loginDate = loginDate;
    }
}
