package com.ironyard;

import java.time.LocalDateTime;

public abstract class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "Notification Status";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public abstract void transport();


    public void showStatus() {
        System.out.println(this.status);
    }

    protected void someText() {
        System.out.println("This is the protected method that prints out some text.");
    }
}
