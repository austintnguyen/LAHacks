import java.util.*;

import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.ComponentList;
import net.fortuna.ical4j.model.component.VEvent;

public class Calendar{

    // Create a new iCalendar
    Calendar calendar = new Calendar();

    // Create a new event
    VEvent event = new VEvent(...);

    // Add the event to the calendar
    ComponentList<com.google.ical.values.component.VEvent> eventList = calendar.getComponents().getComponents(VEvent.VEVENT);
        eventList.add(event);




}