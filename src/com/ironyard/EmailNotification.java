package com.ironyard;

public class EmailNotification extends Notification{
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = "Email Status";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println("Subject: " + this.getSubject());
        System.out.println("Body: " + this.getBody());
        System.out.println("Created: " + this.getCreatedAt());
        System.out.println("Recipient: " + this.getRecipient());
        System.out.println("Provider: " + this.getSmtpProvider());
    }

    @Override
    public void someText() {
        super.someText();
        System.out.println("This is the additional text in Email notification.");
    }
}
