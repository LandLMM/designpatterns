package com.designpatterns.project.preparators;

import com.designpatterns.project.EmailPreparator;
import com.designpatterns.project.Event;
import com.designpatterns.project.MailTemplate;

public class AccEmailPreparator implements EmailPreparator {

    private Event event;

    public AccEmailPreparator(Event event) {
        this.event = event;
    }

    @Override
    public MailTemplate prepareMail() {
        if (event.getEventType().equals(Event.LEAVE)) {
            return getPrepareAccLeaveMailTemplate();
        }
        return getPrepareAccNewTripMailTemplate();
    }

    private MailTemplate getPrepareAccNewTripMailTemplate() {
        MailTemplate mailTemplate = new MailTemplate();
        mailTemplate.setTo("Acc nanowyTrip@gmail.com");
        mailTemplate.setCc("Acc CCnowyTrip@gmail.com");
        mailTemplate.setTitle("Acc na Nowy email- delegacja");
        mailTemplate.setContent("Zawartość maila dla akceptacji nowego eventu- delegacja");
        return mailTemplate;
    }

    private MailTemplate getPrepareAccLeaveMailTemplate() {
        MailTemplate mailTemplate = new MailTemplate();
        mailTemplate.setTo("accLEave@gmail.com");
        mailTemplate.setCc("AccCCnowyTrip@gmail.com");
        mailTemplate.setTitle("Accepted Email- zwolnienie");
        mailTemplate.setContent("Zawartość maila dla zaakceptowanego eventu- zwolnienie");
        return mailTemplate;
    }
}