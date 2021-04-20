package com.company.alexson.calendar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class MyCalendar extends JFrame {
    private DataModel model;
    private JPanel gridDates;
    private JButton forward, backwards, create, quit, forwardMonth, backwardsMonth, edit, delete;
    private JLabel lbMonth, lbYear;
    private int realYear, realMonth, realDay, currentYear, currentMonth, currentDay;
    private GridLayout layoutOfCalendar;
    private int nod, som; // Number Of Days, Start Of Month
    private String date;

    public MyCalendar(DataModel m) {

        model = m;
        setLayout(null);

        gridDates = new JPanel();

        forward = new JButton(">>");
        forward.setBounds(410, 25, 50, 25);

        forward.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentMonth == 11 && currentDay == 31) { // Back one year

                    currentMonth = 0;
                    currentDay = 1;
                    currentYear++;

                } else { // Back one month

                    currentDay++;
                    if (currentDay > nod) {
                        currentMonth++;
                        currentDay = 1;
                    }
                }
                refreshCalendar(currentMonth, currentYear, currentDay);
            }

        });

        forwardMonth = new JButton(">>>");
        forwardMonth.setBounds(355, 25, 55, 25);

        forwardMonth.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentMonth == 11 && currentDay == 31) { // Back one year

                    currentMonth = 1;
                    currentDay = 0;
                    currentYear++;

                } else { // Back one month

                    currentMonth++;
                    if (currentMonth > nod) {
                        currentDay++;
                        currentMonth = 1;
                    }
                }
                refreshCalendar(currentMonth, currentYear, currentDay);
            }

        });

        backwards = new JButton("<<");
        backwards.setBounds(40, 25, 50, 25);
        backwards.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (currentMonth == 0 && currentDay == 1) { // Back one year

                    currentMonth = 11;
                    currentDay = 31;
                    currentYear--;

                }

                else { // Back one month

                    currentDay--;
                    if (currentDay == 0) {
                        currentMonth--;
                        GregorianCalendar cal = new GregorianCalendar(currentYear, currentMonth, 1);
                        currentDay = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                    }
                }
                refreshCalendar(currentMonth, currentYear, currentDay);
            }

        });

        backwardsMonth = new JButton("<<<");
        backwardsMonth.setBounds(90, 25, 55, 25);
        backwardsMonth.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (currentMonth == 1 && currentDay == 0) { // Back one year

                    currentMonth = 11;
                    currentDay = 31;
                    currentYear--;

                }

                else { // Back one month

                    currentMonth--;
                    if (currentMonth == 1) {
                        currentDay--;
                        GregorianCalendar cal = new GregorianCalendar(currentYear, currentMonth, 1);
                        currentMonth = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                    }
                }
                refreshCalendar(currentMonth, currentYear, currentDay);
            }

        });


        create = new JButton("Create New");
        create.setBounds(20, 310, 100, 20);
        create.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEventPopUp(model);

            }
        });

        edit = new JButton("Edit");
        edit.setBounds(140, 310, 100, 20);
//        edit.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new AddEventPopUp(model);
//
//            }
//        });

        delete = new JButton("Delete");
        delete.setBounds(260, 310, 100, 20);
//        delete.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new DisplayEvents(model).deleteToTextArea();
//
//            }
//
//        });



        quit = new JButton("Quit");
        quit.setBounds(380, 310, 100, 20);
        quit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileOutputStream fileOut =
                            new FileOutputStream("Events.txt");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(model);
                    out.close();
                    fileOut.close();
                }catch(IOException i) {
                    i.printStackTrace();
                }
                dispose();
            }
        });


        layoutOfCalendar = new GridLayout(6, 7);
        gridDates.setLayout(layoutOfCalendar);
        gridDates.setBounds(10, 50, 500, 250);

        lbYear = new JLabel("");
        lbYear.setBounds(305, 25, 100, 25);

        lbMonth = new JLabel("");
        lbMonth.setBounds(165 - lbMonth.getPreferredSize().width / 2, 25, 100, 25);

        // Get real month/year
        GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance(); // Create
        // calendar

        realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); // Get day

        realMonth = cal.get(GregorianCalendar.MONTH); // Get month

        realYear = cal.get(GregorianCalendar.YEAR); // Get year

        currentMonth = realMonth; // Match month and year
        currentDay = realDay;
        currentYear = realYear;

        DisplayEvents display=new DisplayEvents(model);

        model.attach(display);
        this.add(lbYear);
        this.add(lbMonth);
        this.add(create);
        this.add(backwardsMonth);
        this.add(backwards);
        this.add(forwardMonth);
        this.add(forward);
        this.add(gridDates);
        this.add(edit);
        this.add(delete);
        this.add(quit);
        this.refreshCalendar(currentMonth, currentYear, currentDay);
        this.add(display);


        setResizable(false);
        setSize(new Dimension(500, 750));
        setVisible(true);

    }


    public void refreshCalendar(int month, int year, int day) {

        // Variables
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        lbMonth.setText(months[month]); // Refresh the month label (at the top)

        lbYear.setText(String.valueOf(year)); // Select the correct

        // Get first day of month and number of days
        GregorianCalendar cal = new GregorianCalendar(year, month, 1);

        nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);

        som = cal.get(GregorianCalendar.DAY_OF_WEEK);

        gridDates.removeAll();

        String[] headers = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" }; // All
        // //
        // headers

        if (som == 7) {
            layoutOfCalendar.setRows(7);
        } else {
            layoutOfCalendar.setRows(6);
        }

        for (int i = 0; i < 7; i++) {
            gridDates.add(new JLabel(headers[i]));

        }

        // Draw calendar
        for (int i = 1; i < som; i++) {

            gridDates.add(new JLabel(""));
        }

        for (int i = 1; i <= nod; i++) {
            if (i == day) {
                gridDates.add(new JLabel("[" + Integer.toString(i) + "]"));
            } else
                gridDates.add(new JLabel(Integer.toString(i)));
        }

        gridDates.validate();
        gridDates.repaint();
        date = (currentMonth+1) + "/" + currentDay + "/" + currentYear;
        model.setCurrentDate(date);
        model.updateDate();
    }
}

