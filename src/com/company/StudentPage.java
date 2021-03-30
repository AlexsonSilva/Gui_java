package com.company;

import javax.swing.*;

public class StudentPage extends JFrame {

    private final JButton ASSIGNMENTS_BUTTON;
    private final JButton GRADES_BUTTON;
    private final JButton TIMETABLE_BUTTON;
    private final JButton ATTENDANCE_BUTTON;
    private final JButton EXAM_DATE_BUTTON;
    private final JButton COURSES_BUTTON;


    public StudentPage(){

        JLabel background=new JLabel(new ImageIcon(getClass().getResource("main_bk.jpg")));
        add(background);

        SpringLayout layout = new SpringLayout();
        background.setLayout(layout);

        ASSIGNMENTS_BUTTON = new JButton(new ImageIcon(getClass().getResource("assignment_bk.png")));
        layout.putConstraint(SpringLayout.WEST, ASSIGNMENTS_BUTTON, 5, SpringLayout.WEST, background);
        SpringLayout.Constraints labelCons = layout.getConstraints(ASSIGNMENTS_BUTTON);
        labelCons.setX(Spring.constant(150));
        labelCons.setY(Spring.constant(75));
        background.add(ASSIGNMENTS_BUTTON);

        GRADES_BUTTON = new JButton(new ImageIcon(getClass().getResource("grades_bk.jpg")));
        layout.putConstraint(SpringLayout.WEST, GRADES_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(GRADES_BUTTON);
        labelCons.setX(Spring.constant(300));
        labelCons.setY(Spring.constant(75));
        background.add(GRADES_BUTTON);

        TIMETABLE_BUTTON = new JButton(new ImageIcon(getClass().getResource("timetable_bk.jpg")));
        layout.putConstraint(SpringLayout.WEST, TIMETABLE_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(TIMETABLE_BUTTON);
        labelCons.setX(Spring.constant(480));
        labelCons.setY(Spring.constant(75));
        background.add(TIMETABLE_BUTTON);

        ATTENDANCE_BUTTON = new JButton(new ImageIcon(getClass().getResource("attendance_bk.jpg")));
        layout.putConstraint(SpringLayout.WEST, ATTENDANCE_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(ATTENDANCE_BUTTON);
        labelCons.setX(Spring.constant(150));
        labelCons.setY(Spring.constant(200));
        background.add(ATTENDANCE_BUTTON);

        EXAM_DATE_BUTTON = new JButton(new ImageIcon(getClass().getResource("examdates_bk.jpg")));
        layout.putConstraint(SpringLayout.WEST, EXAM_DATE_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(EXAM_DATE_BUTTON);
        labelCons.setX(Spring.constant(300));
        labelCons.setY(Spring.constant(200));
        background.add(EXAM_DATE_BUTTON);

        COURSES_BUTTON = new JButton(new ImageIcon(getClass().getResource("courses_bk.png")));
        layout.putConstraint(SpringLayout.WEST, COURSES_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_BUTTON);
        labelCons.setX(Spring.constant(480));
        labelCons.setY(Spring.constant(200));
        background.add(COURSES_BUTTON);
    }
}
