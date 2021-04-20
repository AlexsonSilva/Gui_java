package com.company.alexson.calendar;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

public class DisplayEvents extends JPanel implements ChangeListener {
    private DataModel model;
    private JLabel date;
    private static JTextArea agenda;
    private static ArrayList<Event> schedule;
    private static String day;


    /**
     * creates the object for the class
     * using a given data model
     * @param d
     */
    public DisplayEvents(DataModel d) {
        model=d;
        setBounds(10, 350, 250,100);
        date= new JLabel(model.getCurrentDate());
        agenda= new JTextArea();
        agenda.setBackground(Color.lightGray);
        agenda.setEditable(false);
        agenda.setPreferredSize(new Dimension(100, 100));
        setLayout(new BorderLayout());
        add(date,BorderLayout.NORTH);
        add(agenda,BorderLayout.CENTER);

        setSize(new Dimension(480, 350));
        setVisible(true);

    }


    /**
     * Adds the messages to the
     * test area
     */
    public void printToTextArea(){
        Collections.sort(schedule);
        agenda.setText("");
        for(Event s: schedule){
            if(s.getDate().equals(day))
                agenda.append(s.getEvent()+"\n");
        }
        agenda.selectAll();

    }

//    public void deleteToTextArea(){
//        Collections.sort(schedule);
//        agenda.setText("");
//        for(Event s: schedule){
//            if(s.getDate().equals(day))
//                agenda.append(s.getEvent()+"\n");
//        }
//        agenda.removeAll();
//
//
//    }

    /**
     * state of the changes that happen
     * in the calendar component.
     */
    @Override
    public void stateChanged(ChangeEvent e) {
        schedule =model.getData();
        day=model.getCurrentDate();
        printToTextArea();
        date.setText(model.getCurrentDate());

    }
}

