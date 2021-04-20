package com.company.alexson.calendar;

import java.io.Serializable;
import java.util.Calendar;

public class Event implements Comparable<Event>, Serializable {
    String course;
    String dateEvent;
    String hour;
    String minutes;
    String dayOfWeek;
    String monthName;
    String specification;
    int month, day, year;

    public static String mnames[] = { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov",
            "Dec" };
    String[] daysOfTheWeek = { "Mon", "Tue", "Wen", "Thu", "Fri", "Sat", "Sun" };
    /**
     * creates the event objects
     * @param course
     * @param date
     * @param hour
     * @param minutes
     */
    public Event(String course, String date, String hour, String minutes, String specification) {
        this.course = course;
        this.dateEvent = date;

        String[] d = date.split("/");
        this.month = Integer.parseInt(d[0]);
        System.out.println(d[1]);
        this.day = Integer.parseInt(d[1]);
        this.year = Integer.parseInt(d[2]);

        this.hour = hour;
        this.minutes = minutes;
        this.specification = specification;
        this.monthName = mnames[month - 1];
        this.dayOfWeek = daysOfTheWeek[this.getDayOfTheWeekValue()];
    }


    /**
     * return the title of the event
     *
     * @return title
     */
    public String getCourse() {
        return course;
    }


    /**
     * return the date of the event
     *
     * @return dateEvent
     */
    public String getDate() {
        return dateEvent;
    }

    /**
     * returns the start time of the event
     *
     * @return start
     */
    public String getHour() {
        return hour;
    }

    /**
     * returns the end time of the event
     *
     * @return end
     */
    public String getMinutes() {
        return minutes;
    }

    public String getSpecification() {
        return specification;
    }


    /**
     * returns the day of the week of the event
     *
     * @return dayOfWeek
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * the name of the month in short hand
     *
     * @return monthName
     */
    public String getMonthName() {
        return monthName;
    }

    /**
     * return the number of the month
     *
     * @return month
     */
    public int getMonth() {
        return month;
    }

    /**
     * return the day number
     *
     * @return day
     */
    public int getDay() {
        return day;
    }

    /**
     * return the year
     *
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * return the value of the day of the week
     *
     * @return intDayOfWeek
     */


    public int getDayOfTheWeekValue() {
        Calendar c = Calendar.getInstance();
        String[] d = dateEvent.split("/");
        c.set(Integer.parseInt(d[2]), Integer.parseInt(d[0]), Integer.parseInt(d[1]));
        return c.get(Calendar.DAY_OF_WEEK);
    }
    /**
     * checks to see if to events are equal
     * @return bool.
     */
    public boolean equals(Event that) {
        if(this.compareTo(that)==0){
            return true;
        }
        return false;
    }

    /**
     * compare to method that compares
     * one event to the other
     */
    @Override
    public int compareTo(Event that) {

        if (this.getYear() != that.getYear()) {
            return this.getYear() - that.getYear();
        }

        else if (this.getMonth() != that.getMonth()) {
            return this.getMonth() - that.getMonth();
        }

        else if(this.getDay() != that.getDay()){
            return this.getDay() - that.getDay();
        }
        else{
            return this.getHour().compareTo(that.getHour());
        }
    }

    public String getEvent() {
        return course + "\n" + "\n" + specification + "\n" + hour + ":" + minutes + "\n -------------------------------" +
                "-----------------------------------------";
    }
}

