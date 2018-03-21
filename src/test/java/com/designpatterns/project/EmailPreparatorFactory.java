package com.designpatterns.project;

import com.designpatterns.project.preparators.AccEmailPreparator;
import com.designpatterns.project.preparators.NewEmailPreparator;

class EmailPreparatorFactory {

    EmailPreparator getEmailPreparator(Event event) {
        switch (event.getEventStatus()) {
            case "NEW":
                return new NewEmailPreparator(event);
            case "ACC":
                return new AccEmailPreparator(event);
            default:
                return null;
        }
    }
}