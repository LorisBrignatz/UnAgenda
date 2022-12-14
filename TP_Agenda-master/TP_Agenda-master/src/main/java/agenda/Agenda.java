package agenda;

import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    private ArrayList<Event> lesEvents;

    public Agenda(){
        this.lesEvents = new ArrayList<>();
    }

    public void addEvent(Event e) {

        lesEvents.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
        List<Event> lesEventsDay = new ArrayList<Event>();
        for (int i = 0; i < lesEvents.size(); i ++){
            if (lesEvents.get(i).isInDay(day)){
                lesEventsDay.add(lesEvents.get(i));
            }
        }
        return lesEventsDay;
        }
    }

