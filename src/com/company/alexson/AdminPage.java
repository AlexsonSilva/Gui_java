package com.company.alexson;

import javax.swing.*;
import java.awt.*;
import java.util.EnumMap;

public class AdminPage extends JFrame{

    private final JLabel TUTOR_LABEL;
    private final JLabel COURSES_LABEL;
    private final JLabel TIMETABLE_LABEL;
    private final JLabel ATTENDANCE_LABEL;
    private final JLabel EXAMDATES_LABEL;
    private final JLabel FEES_LABEL;
    private final JLabel ENROLMENT_LABEL;

    private final JCheckBox BRANCH1_CHECKBOX;
    private final JCheckBox BRANCH2_CHECKBOX;
    private final JCheckBox BRANCH3_CHECKBOX;
    private final ButtonGroup CHECKBOX_GROUP;

    private final JButton TUTOR_BUTTON;
    private final JButton COURSES_BUTTON;
    private final JButton TIMETABLE_BUTTON;
    private final JButton ATTENDANCE_BUTTON;
    private final JButton EXAMDATES_BUTTON;
    private final JButton FEES_BUTTON;
    private final JButton ENROLMENT_BUTTON;

    public AdminPage(){
        super("Admim Page");

        JLabel background = new JLabel(new ImageIcon(getClass().getResource("images/admin_bk.jpeg")));
        add(background);

        SpringLayout layout = new SpringLayout();
        background.setLayout(layout);

        TUTOR_LABEL = new JLabel("Create/Edit/Delete Tutor");
        TUTOR_LABEL.setFont(TUTOR_LABEL.getFont().deriveFont(16f));
        TUTOR_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, TUTOR_LABEL, 5, SpringLayout.WEST, background);
        SpringLayout.Constraints labelCons = layout.getConstraints(TUTOR_LABEL);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(100));
        background.add(TUTOR_LABEL);

        COURSES_LABEL = new JLabel("Create/Edit/Delete Courses");
        COURSES_LABEL.setFont(TUTOR_LABEL.getFont().deriveFont(16f));
        COURSES_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, COURSES_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_LABEL);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(140));
        background.add(COURSES_LABEL);

        TIMETABLE_LABEL = new JLabel("Create/Edit/Delete Timetable");
        TIMETABLE_LABEL.setFont(TIMETABLE_LABEL.getFont().deriveFont(16f));
        TIMETABLE_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, TIMETABLE_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(TIMETABLE_LABEL);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(180));
        background.add(TIMETABLE_LABEL);

        ATTENDANCE_LABEL = new JLabel("Create/Edit/Delete Attendance");
        ATTENDANCE_LABEL.setFont(ATTENDANCE_LABEL.getFont().deriveFont(16f));
        ATTENDANCE_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, ATTENDANCE_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(ATTENDANCE_LABEL);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(220));
        background.add(ATTENDANCE_LABEL);

        EXAMDATES_LABEL = new JLabel("Create/Edit/Delete Exam Dates");
        EXAMDATES_LABEL.setFont(EXAMDATES_LABEL.getFont().deriveFont(16f));
        EXAMDATES_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, EXAMDATES_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(EXAMDATES_LABEL);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(260));
        background.add(EXAMDATES_LABEL);

        FEES_LABEL = new JLabel("Create/Edit Fees");
        FEES_LABEL.setFont(FEES_LABEL.getFont().deriveFont(16f));
        FEES_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, FEES_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(FEES_LABEL);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(300));
        background.add(FEES_LABEL);

        ENROLMENT_LABEL = new JLabel("Enrolment of Students");
        ENROLMENT_LABEL.setFont(ENROLMENT_LABEL.getFont().deriveFont(16f));
        ENROLMENT_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, ENROLMENT_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(ENROLMENT_LABEL);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(340));
        background.add(ENROLMENT_LABEL);

        BRANCH1_CHECKBOX = new JCheckBox("Branch I");
        BRANCH1_CHECKBOX.setFont(BRANCH1_CHECKBOX.getFont().deriveFont(16f));
        BRANCH1_CHECKBOX.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, BRANCH1_CHECKBOX, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(BRANCH1_CHECKBOX);
        labelCons.setX(Spring.constant(100));
        labelCons.setY(Spring.constant(30));
        background.add(BRANCH1_CHECKBOX);

        BRANCH2_CHECKBOX = new JCheckBox("Branch II");
        BRANCH2_CHECKBOX.setFont(BRANCH2_CHECKBOX.getFont().deriveFont(16f));
        BRANCH2_CHECKBOX.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, BRANCH2_CHECKBOX, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(BRANCH2_CHECKBOX);
        labelCons.setX(Spring.constant(250));
        labelCons.setY(Spring.constant(30));
        background.add(BRANCH2_CHECKBOX);

        BRANCH3_CHECKBOX = new JCheckBox("Branch III");
        BRANCH3_CHECKBOX.setFont(BRANCH3_CHECKBOX.getFont().deriveFont(16f));
        BRANCH3_CHECKBOX.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, BRANCH3_CHECKBOX, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(BRANCH3_CHECKBOX);
        labelCons.setX(Spring.constant(400));
        labelCons.setY(Spring.constant(30));
        background.add(BRANCH3_CHECKBOX);

        CHECKBOX_GROUP = new ButtonGroup();
        CHECKBOX_GROUP.add(BRANCH1_CHECKBOX);
        CHECKBOX_GROUP.add(BRANCH2_CHECKBOX);
        CHECKBOX_GROUP.add(BRANCH3_CHECKBOX);

        TUTOR_BUTTON = new JButton("...");
        TUTOR_BUTTON.setFont(TUTOR_BUTTON.getFont().deriveFont(18f));
        layout.putConstraint(SpringLayout.WEST, TUTOR_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(TUTOR_BUTTON);
        labelCons.setX(Spring.constant(320));
        labelCons.setY(Spring.constant(100));
        background.add(TUTOR_BUTTON);

        COURSES_BUTTON = new JButton("...");
        COURSES_BUTTON.setFont(COURSES_BUTTON.getFont().deriveFont(18f));
        layout.putConstraint(SpringLayout.WEST, COURSES_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_BUTTON);
        labelCons.setX(Spring.constant(320));
        labelCons.setY(Spring.constant(140));
        background.add(COURSES_BUTTON);

        TIMETABLE_BUTTON = new JButton("...");
        TIMETABLE_BUTTON.setFont(TIMETABLE_BUTTON.getFont().deriveFont(18f));
        layout.putConstraint(SpringLayout.WEST, TIMETABLE_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(TIMETABLE_BUTTON);
        labelCons.setX(Spring.constant(320));
        labelCons.setY(Spring.constant(180));
        background.add(TIMETABLE_BUTTON);

        ATTENDANCE_BUTTON = new JButton("...");
        ATTENDANCE_BUTTON.setFont(ATTENDANCE_BUTTON.getFont().deriveFont(18f));
        layout.putConstraint(SpringLayout.WEST, ATTENDANCE_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(ATTENDANCE_BUTTON);
        labelCons.setX(Spring.constant(320));
        labelCons.setY(Spring.constant(220));
        background.add(ATTENDANCE_BUTTON);

        EXAMDATES_BUTTON = new JButton("...");
        EXAMDATES_BUTTON.setFont(EXAMDATES_BUTTON.getFont().deriveFont(18f));
        layout.putConstraint(SpringLayout.WEST, EXAMDATES_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(EXAMDATES_BUTTON);
        labelCons.setX(Spring.constant(320));
        labelCons.setY(Spring.constant(260));
        background.add(EXAMDATES_BUTTON);

        FEES_BUTTON = new JButton("...");
        FEES_BUTTON.setFont(FEES_BUTTON.getFont().deriveFont(18f));
        layout.putConstraint(SpringLayout.WEST, FEES_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(FEES_BUTTON);
        labelCons.setX(Spring.constant(320));
        labelCons.setY(Spring.constant(300));
        background.add(FEES_BUTTON);

        ENROLMENT_BUTTON = new JButton("...");
        ENROLMENT_BUTTON.setFont(ENROLMENT_BUTTON.getFont().deriveFont(18f));
        layout.putConstraint(SpringLayout.WEST, ENROLMENT_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(ENROLMENT_BUTTON);
        labelCons.setX(Spring.constant(320));
        labelCons.setY(Spring.constant(340));
        background.add(ENROLMENT_BUTTON);
    }
}
