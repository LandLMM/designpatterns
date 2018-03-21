package com.designpatterns.project;

public class TestEmailPreparator {

    public static void main(String[] args) {
        Event event = new Event();
        event.setEventType("LEAVE");
        event.setEventStatus("ACC");

        EmailPreparatorFactory factory = new EmailPreparatorFactory();
        EmailPreparator emailPreparator = factory.getEmailPreparator(event);
        MailTemplate mailTemplate = emailPreparator.prepareMail();
        System.out.println(mailTemplate);
    }
}