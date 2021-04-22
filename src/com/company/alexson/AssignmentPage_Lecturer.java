package com.company.alexson;

import javax.swing.*;
import java.awt.*;

public class AssignmentPage_Lecturer extends JFrame {

    private final JLabel ASSIGNMENTS_LABEL;
    private final JLabel COURSES_LABEL;
    private final JLabel DATE_LABEL;
    private final JLabel SPECIFICATIONS_LABEL;

    private final JTextField COURSES_TEXTFIELD1;
    private final JTextField COURSES_TEXTFIELD2;
    private final JTextField COURSES_TEXTFIELD3;
    private final JTextField COURSES_TEXTFIELD4;
    private final JTextField COURSES_TEXTFIELD5;
    private final JTextField COURSES_TEXTFIELD6;
    private final JTextField DATE_TEXTFIELD1;
    private final JTextField DATE_TEXTFIELD2;
    private final JTextField DATE_TEXTFIELD3;
    private final JTextField DATE_TEXTFIELD4;
    private final JTextField DATE_TEXTFIELD5;
    private final JTextField DATE_TEXTFIELD6;
    private final JTextField SPECIFICATIONS_TEXTFIELD1;
    private final JTextField SPECIFICATIONS_TEXTFIELD2;
    private final JTextField SPECIFICATIONS_TEXTFIELD3;
    private final JTextField SPECIFICATIONS_TEXTFIELD4;
    private final JTextField SPECIFICATIONS_TEXTFIELD5;
    private final JTextField SPECIFICATIONS_TEXTFIELD6;

    private final JButton CREATENEW_BUTTON;
    private final JButton VIEW_BUTTON1;
    private final JButton VIEW_BUTTON2;
    private final JButton VIEW_BUTTON3;
    private final JButton VIEW_BUTTON4;
    private final JButton VIEW_BUTTON5;
    private final JButton VIEW_BUTTON6;
    private final JButton EDIT_BUTTON1;
    private final JButton EDIT_BUTTON2;
    private final JButton EDIT_BUTTON3;
    private final JButton EDIT_BUTTON4;
    private final JButton EDIT_BUTTON5;
    private final JButton EDIT_BUTTON6;

    public AssignmentPage_Lecturer() {

        super("Lecturer Assigment");

        JLabel background = new JLabel(new ImageIcon(getClass().getResource("images/main_bk.jpeg")));
        add(background);

        SpringLayout layout = new SpringLayout();
        background.setLayout(layout);

        ASSIGNMENTS_LABEL = new JLabel("Assignments");
        ASSIGNMENTS_LABEL.setFont(ASSIGNMENTS_LABEL.getFont().deriveFont(22f));
        ASSIGNMENTS_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, ASSIGNMENTS_LABEL, 5, SpringLayout.WEST, background);
        SpringLayout.Constraints labelCons = layout.getConstraints(ASSIGNMENTS_LABEL);
        labelCons.setX(Spring.constant(330));
        labelCons.setY(Spring.constant(25));
        background.add(ASSIGNMENTS_LABEL);

        COURSES_LABEL = new JLabel("Course");
        COURSES_LABEL.setFont(COURSES_LABEL.getFont().deriveFont(18f));
        COURSES_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, COURSES_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_LABEL);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(150));
        background.add(COURSES_LABEL);

        DATE_LABEL = new JLabel("Date");
        DATE_LABEL.setFont(DATE_LABEL.getFont().deriveFont(18f));
        DATE_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, DATE_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(DATE_LABEL);
        labelCons.setX(Spring.constant(170));
        labelCons.setY(Spring.constant(150));
        background.add(DATE_LABEL);

        SPECIFICATIONS_LABEL = new JLabel("Specifications");
        SPECIFICATIONS_LABEL.setFont(SPECIFICATIONS_LABEL.getFont().deriveFont(18f));
        SPECIFICATIONS_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, SPECIFICATIONS_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(SPECIFICATIONS_LABEL);
        labelCons.setX(Spring.constant(270));
        labelCons.setY(Spring.constant(150));
        background.add(SPECIFICATIONS_LABEL);

        COURSES_TEXTFIELD1 = new JTextField("", 10);
        COURSES_TEXTFIELD1.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, COURSES_TEXTFIELD1, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_TEXTFIELD1);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(180));
        background.add(COURSES_TEXTFIELD1);

        COURSES_TEXTFIELD2 = new JTextField("", 10);
        COURSES_TEXTFIELD2.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, COURSES_TEXTFIELD2, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_TEXTFIELD2);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(210));
        background.add(COURSES_TEXTFIELD2);

        COURSES_TEXTFIELD3 = new JTextField("", 10);
        COURSES_TEXTFIELD3.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, COURSES_TEXTFIELD3, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_TEXTFIELD3);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(240));
        background.add(COURSES_TEXTFIELD3);

        COURSES_TEXTFIELD4 = new JTextField("", 10);
        COURSES_TEXTFIELD4.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, COURSES_TEXTFIELD4, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_TEXTFIELD4);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(270));
        background.add(COURSES_TEXTFIELD4);

        COURSES_TEXTFIELD5 = new JTextField("", 10);
        COURSES_TEXTFIELD5.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, COURSES_TEXTFIELD5, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_TEXTFIELD5);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(300));
        background.add(COURSES_TEXTFIELD5);

        COURSES_TEXTFIELD6 = new JTextField("", 10);
        COURSES_TEXTFIELD6.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, COURSES_TEXTFIELD6, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_TEXTFIELD6);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(330));
        background.add(COURSES_TEXTFIELD6);

        DATE_TEXTFIELD1 = new JTextField("", 6);
        DATE_TEXTFIELD1.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, DATE_TEXTFIELD1, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(DATE_TEXTFIELD1);
        labelCons.setX(Spring.constant(170));
        labelCons.setY(Spring.constant(180));
        background.add(DATE_TEXTFIELD1);

        DATE_TEXTFIELD2 = new JTextField("", 6);
        DATE_TEXTFIELD2.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, DATE_TEXTFIELD2, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(DATE_TEXTFIELD2);
        labelCons.setX(Spring.constant(170));
        labelCons.setY(Spring.constant(210));
        background.add(DATE_TEXTFIELD2);

        DATE_TEXTFIELD3 = new JTextField("", 6);
        DATE_TEXTFIELD3.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, DATE_TEXTFIELD3, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(DATE_TEXTFIELD3);
        labelCons.setX(Spring.constant(170));
        labelCons.setY(Spring.constant(240));
        background.add(DATE_TEXTFIELD3);

        DATE_TEXTFIELD4 = new JTextField("", 6);
        DATE_TEXTFIELD4.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, DATE_TEXTFIELD4, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(DATE_TEXTFIELD4);
        labelCons.setX(Spring.constant(170));
        labelCons.setY(Spring.constant(270));
        background.add(DATE_TEXTFIELD4);

        DATE_TEXTFIELD5 = new JTextField("", 6);
        DATE_TEXTFIELD5.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, DATE_TEXTFIELD5, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(DATE_TEXTFIELD5);
        labelCons.setX(Spring.constant(170));
        labelCons.setY(Spring.constant(300));
        background.add(DATE_TEXTFIELD5);

        DATE_TEXTFIELD6 = new JTextField("", 6);
        DATE_TEXTFIELD6.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, DATE_TEXTFIELD6, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(DATE_TEXTFIELD6);
        labelCons.setX(Spring.constant(170));
        labelCons.setY(Spring.constant(330));
        background.add(DATE_TEXTFIELD6);

        SPECIFICATIONS_TEXTFIELD1 = new JTextField("", 25);
        SPECIFICATIONS_TEXTFIELD1.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, SPECIFICATIONS_TEXTFIELD1, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(SPECIFICATIONS_TEXTFIELD1);
        labelCons.setX(Spring.constant(270));
        labelCons.setY(Spring.constant(180));
        background.add(SPECIFICATIONS_TEXTFIELD1);

        SPECIFICATIONS_TEXTFIELD2 = new JTextField("", 25);
        SPECIFICATIONS_TEXTFIELD2.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, SPECIFICATIONS_TEXTFIELD2, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(SPECIFICATIONS_TEXTFIELD2);
        labelCons.setX(Spring.constant(270));
        labelCons.setY(Spring.constant(210));
        background.add(SPECIFICATIONS_TEXTFIELD2);

        SPECIFICATIONS_TEXTFIELD3 = new JTextField("", 25);
        SPECIFICATIONS_TEXTFIELD3.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, SPECIFICATIONS_TEXTFIELD3, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(SPECIFICATIONS_TEXTFIELD3);
        labelCons.setX(Spring.constant(270));
        labelCons.setY(Spring.constant(240));
        background.add(SPECIFICATIONS_TEXTFIELD3);

        SPECIFICATIONS_TEXTFIELD4 = new JTextField("", 25);
        SPECIFICATIONS_TEXTFIELD4.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, SPECIFICATIONS_TEXTFIELD4, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(SPECIFICATIONS_TEXTFIELD4);
        labelCons.setX(Spring.constant(270));
        labelCons.setY(Spring.constant(270));
        background.add(SPECIFICATIONS_TEXTFIELD4);

        SPECIFICATIONS_TEXTFIELD5 = new JTextField("", 25);
        SPECIFICATIONS_TEXTFIELD5.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, SPECIFICATIONS_TEXTFIELD5, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(SPECIFICATIONS_TEXTFIELD5);
        labelCons.setX(Spring.constant(270));
        labelCons.setY(Spring.constant(300));
        background.add(SPECIFICATIONS_TEXTFIELD5);

        SPECIFICATIONS_TEXTFIELD6 = new JTextField("", 25);
        SPECIFICATIONS_TEXTFIELD6.setEditable(false);
        layout.putConstraint(SpringLayout.WEST, SPECIFICATIONS_TEXTFIELD6, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(SPECIFICATIONS_TEXTFIELD6);
        labelCons.setX(Spring.constant(270));
        labelCons.setY(Spring.constant(330));
        background.add(SPECIFICATIONS_TEXTFIELD6);

        CREATENEW_BUTTON = new JButton("Create New");
        layout.putConstraint(SpringLayout.WEST, CREATENEW_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(CREATENEW_BUTTON);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(80));
        background.add(CREATENEW_BUTTON);

        EDIT_BUTTON1 = new JButton("Edit");
        layout.putConstraint(SpringLayout.WEST, EDIT_BUTTON1, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(EDIT_BUTTON1);
        labelCons.setX(Spring.constant(590));
        labelCons.setY(Spring.constant(180));
        background.add(EDIT_BUTTON1);

        EDIT_BUTTON2 = new JButton("Edit");
        layout.putConstraint(SpringLayout.WEST, EDIT_BUTTON2, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(EDIT_BUTTON2);
        labelCons.setX(Spring.constant(590));
        labelCons.setY(Spring.constant(210));
        background.add(EDIT_BUTTON2);

        EDIT_BUTTON3 = new JButton("Edit");
        layout.putConstraint(SpringLayout.WEST, EDIT_BUTTON3, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(EDIT_BUTTON3);
        labelCons.setX(Spring.constant(590));
        labelCons.setY(Spring.constant(240));
        background.add(EDIT_BUTTON3);

        EDIT_BUTTON4 = new JButton("Edit");
        layout.putConstraint(SpringLayout.WEST, EDIT_BUTTON4, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(EDIT_BUTTON4);
        labelCons.setX(Spring.constant(590));
        labelCons.setY(Spring.constant(270));
        background.add(EDIT_BUTTON4);

        EDIT_BUTTON5 = new JButton("Edit");
        layout.putConstraint(SpringLayout.WEST, EDIT_BUTTON5, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(EDIT_BUTTON5);
        labelCons.setX(Spring.constant(590));
        labelCons.setY(Spring.constant(300));
        background.add(EDIT_BUTTON5);

        EDIT_BUTTON6 = new JButton("Edit");
        layout.putConstraint(SpringLayout.WEST, EDIT_BUTTON6, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(EDIT_BUTTON6);
        labelCons.setX(Spring.constant(590));
        labelCons.setY(Spring.constant(330));
        background.add(EDIT_BUTTON6);

        VIEW_BUTTON1 = new JButton("View");
        layout.putConstraint(SpringLayout.WEST, VIEW_BUTTON1, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(VIEW_BUTTON1);
        labelCons.setX(Spring.constant(660));
        labelCons.setY(Spring.constant(180));
        background.add(VIEW_BUTTON1);

        VIEW_BUTTON2 = new JButton("View");
        layout.putConstraint(SpringLayout.WEST, VIEW_BUTTON2, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(VIEW_BUTTON2);
        labelCons.setX(Spring.constant(660));
        labelCons.setY(Spring.constant(210));
        background.add(VIEW_BUTTON2);

        VIEW_BUTTON3 = new JButton("View");
        layout.putConstraint(SpringLayout.WEST, VIEW_BUTTON3, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(VIEW_BUTTON3);
        labelCons.setX(Spring.constant(660));
        labelCons.setY(Spring.constant(240));
        background.add(VIEW_BUTTON3);

        VIEW_BUTTON4 = new JButton("View");
        layout.putConstraint(SpringLayout.WEST, VIEW_BUTTON4, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(VIEW_BUTTON4);
        labelCons.setX(Spring.constant(660));
        labelCons.setY(Spring.constant(270));
        background.add(VIEW_BUTTON4);

        VIEW_BUTTON5 = new JButton("View");
        layout.putConstraint(SpringLayout.WEST, VIEW_BUTTON5, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(VIEW_BUTTON5);
        labelCons.setX(Spring.constant(660));
        labelCons.setY(Spring.constant(300));
        background.add(VIEW_BUTTON5);

        VIEW_BUTTON6 = new JButton("View");
        layout.putConstraint(SpringLayout.WEST, VIEW_BUTTON6, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(VIEW_BUTTON6);
        labelCons.setX(Spring.constant(660));
        labelCons.setY(Spring.constant(330));
        background.add(VIEW_BUTTON6);
    }


}
