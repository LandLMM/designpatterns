package com.designpatterns.project.preparators;

import com.designpatterns.project.EmailPreparator;
import com.designpatterns.project.Event;
import com.designpatterns.project.MailTemplate;

public class NewEmailPreparator implements EmailPreparator {


    private Event event;

    public NewEmailPreparator(Event event) {
        this.event = event;
    }


    @Override
    public MailTemplate prepareMail() {
        if (event.getEventType().equals(Event.LEAVE)) {
            return prepareNewLeaveMailTemplate();
        }
        return getPrepareNewTripMailTemplate();
    }

    private MailTemplate getPrepareNewTripMailTemplate() {
        MailTemplate mailTemplate = new MailTemplate();
        mailTemplate.setTo("nowyTrip@gmail.com");
        mailTemplate.setCc("CCnowyTrip@gmail.com");
        mailTemplate.setTitle("Nowy email- delegacja");
        mailTemplate.setContent("Zawartość maila dla nowego eventu- delegacja");
        return mailTemplate;
    }

    private MailTemplate prepareNewLeaveMailTemplate() {
        MailTemplate mailTemplate = new MailTemplate();
        mailTemplate.setTo("nowyLeave@gmail.com");
        mailTemplate.setCc("CCnowyLeave@gmail.com");
        mailTemplate.setTitle("Nowy email- zwolnienie");
        mailTemplate.setContent("Zawartość maila dla nowego eventu- zwolnienie");
        return mailTemplate;
    }
}