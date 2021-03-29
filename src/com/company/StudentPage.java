package com.company;

import javax.swing.*;

public class StudentPage extends JFrame {

    private final JButton assignmentsButton;
    private final JButton gradesButton;
    private final JButton timetableButton;
    private final JButton attendanceButton;
    private final JButton examDateButton;
    private final JButton coursesButton;


    public StudentPage(){

        JLabel background=new JLabel(new ImageIcon(getClass().getResource("main_bk.jpg")));
        add(background);

        SpringLayout layout = new SpringLayout();
        background.setLayout(layout);

        assignmentsButton = new JButton(new ImageIcon(getClass().getResource("assignment_bk.png")));
        layout.putConstraint(SpringLayout.WEST, assignmentsButton, 5, SpringLayout.WEST, background);
        SpringLayout.Constraints labelCons = layout.getConstraints(assignmentsButton);
        labelCons.setX(Spring.constant(150));
        labelCons.setY(Spring.constant(75));
        background.add(assignmentsButton);

        gradesButton = new JButton(new ImageIcon(getClass().getResource("grades_bk.jpg")));
        layout.putConstraint(SpringLayout.WEST, gradesButton, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(gradesButton);
        labelCons.setX(Spring.constant(300));
        labelCons.setY(Spring.constant(75));
        background.add(gradesButton);

        timetableButton = new JButton(new ImageIcon(getClass().getResource("timetable_bk.jpg")));
        layout.putConstraint(SpringLayout.WEST, timetableButton, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(timetableButton);
        labelCons.setX(Spring.constant(480));
        labelCons.setY(Spring.constant(75));
        background.add(timetableButton);

        attendanceButton = new JButton(new ImageIcon(getClass().getResource("attendance_bk.jpg")));
        layout.putConstraint(SpringLayout.WEST, attendanceButton, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(attendanceButton);
        labelCons.setX(Spring.constant(150));
        labelCons.setY(Spring.constant(200));
        background.add(attendanceButton);

        examDateButton = new JButton(new ImageIcon(getClass().getResource("examdates_bk.jpg")));
        layout.putConstraint(SpringLayout.WEST, examDateButton, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(examDateButton);
        labelCons.setX(Spring.constant(300));
        labelCons.setY(Spring.constant(200));
        background.add(examDateButton);

        coursesButton = new JButton(new ImageIcon(getClass().getResource("courses_bk.png")));
        layout.putConstraint(SpringLayout.WEST, coursesButton, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(coursesButton);
        labelCons.setX(Spring.constant(480));
        labelCons.setY(Spring.constant(200));
        background.add(coursesButton);
    }
}
