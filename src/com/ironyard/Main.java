package com.ironyard;

public class Main {

    public static void main(String[] args) {
        EmailNotification myEmail = new EmailNotification("Hello", "My test email", "Sam", "Google");
        TextNotification myText = new TextNotification("Hi", "Test text", "Caroline", "AT&T");

        myEmail.transport();
        myText.transport();

        myEmail.showStatus();
        myText.showStatus();

        myEmail.someText();
    }
}
