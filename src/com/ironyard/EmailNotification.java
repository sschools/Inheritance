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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() {
        EmailNotification copy = this;
        return copy;
    }
}
