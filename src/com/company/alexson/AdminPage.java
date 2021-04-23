package com.company.alexson;

import com.company.alexson.calendar.DataModel;
import com.company.alexson.calendar.MyCalendar;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPage extends JFrame {

    private final JLabel LECTURER_LABEL;
    private final JLabel COURSES_LABEL;
    private final JLabel COLLEGE_BRANCH_LABEL;
    private final JLabel STUDENT_LABEL;
    private final JLabel MODULE_LABEL;
//    private final JLabel FEES_LABEL;
//    private final JLabel ENROLMENT_LABEL;

    private final JButton LECTURER_BUTTON;
    private final JButton COURSES_BUTTON;
    private final JButton COLLEGE_BRANCH_BUTTON;
    private final JButton STUDENT_BUTTON;
    private final JButton MODULE_BUTTON;
//    private final JButton FEES_BUTTON;
//    private final JButton ENROLMENT_BUTTON;

    private final JComboBox<String> BRANCH_COMBOBOX;

    private final String[] branch_Combobox = {"Branch I", "Branch II",
            "Branch III"};

    public AdminPage() {
        super("Admim Page");

        JLabel background = new JLabel(new ImageIcon((getClass().getResource("images/admin_bk.jpeg"))));
        add(background);

        SpringLayout layout = new SpringLayout();
        background.setLayout(layout);

        LECTURER_LABEL = new JLabel("Create/Edit/Delete Lecturer");
        LECTURER_LABEL.setFont(LECTURER_LABEL.getFont().deriveFont(16f));
        LECTURER_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, LECTURER_LABEL, 5, SpringLayout.WEST, background);
        SpringLayout.Constraints labelCons = layout.getConstraints(LECTURER_LABEL);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(100));
        background.add(LECTURER_LABEL);

        STUDENT_LABEL = new JLabel("Create/Edit/Delete Student");
        STUDENT_LABEL.setFont(STUDENT_LABEL.getFont().deriveFont(16f));
        STUDENT_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, STUDENT_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(STUDENT_LABEL);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(140));
        background.add(STUDENT_LABEL);

        COLLEGE_BRANCH_LABEL = new JLabel("Create/Edit/Delete College Branch");
        COLLEGE_BRANCH_LABEL.setFont(COLLEGE_BRANCH_LABEL.getFont().deriveFont(16f));
        COLLEGE_BRANCH_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, COLLEGE_BRANCH_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COLLEGE_BRANCH_LABEL);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(180));
        background.add(COLLEGE_BRANCH_LABEL);

        COURSES_LABEL = new JLabel("Create/Edit/Delete Courses");
        COURSES_LABEL.setFont(COURSES_LABEL.getFont().deriveFont(16f));
        COURSES_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, COURSES_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_LABEL);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(220));
        background.add(COURSES_LABEL);

        MODULE_LABEL = new JLabel("Create/Edit/Delete Module");
        MODULE_LABEL.setFont(MODULE_LABEL.getFont().deriveFont(16f));
        MODULE_LABEL.setForeground(Color.white);
        layout.putConstraint(SpringLayout.WEST, MODULE_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(MODULE_LABEL);
        labelCons.setX(Spring.constant(25));
        labelCons.setY(Spring.constant(260));
        background.add(MODULE_LABEL);

//        FEES_LABEL = new JLabel("Create/Edit Fees");
//        FEES_LABEL.setFont(FEES_LABEL.getFont().deriveFont(16f));
//        FEES_LABEL.setForeground(Color.white);
//        layout.putConstraint(SpringLayout.WEST, FEES_LABEL, 5, SpringLayout.WEST, background);
//        labelCons = layout.getConstraints(FEES_LABEL);
//        labelCons.setX(Spring.constant(25));
//        labelCons.setY(Spring.constant(300));
//        background.add(FEES_LABEL);
//
//        ENROLMENT_LABEL = new JLabel("Enrolment of Students");
//        ENROLMENT_LABEL.setFont(ENROLMENT_LABEL.getFont().deriveFont(16f));
//        ENROLMENT_LABEL.setForeground(Color.white);
//        layout.putConstraint(SpringLayout.WEST, ENROLMENT_LABEL, 5, SpringLayout.WEST, background);
//        labelCons = layout.getConstraints(ENROLMENT_LABEL);
//        labelCons.setX(Spring.constant(25));
//        labelCons.setY(Spring.constant(340));
//        background.add(ENROLMENT_LABEL);

        BRANCH_COMBOBOX = new JComboBox<String>(branch_Combobox);
        BRANCH_COMBOBOX.setFont(BRANCH_COMBOBOX.getFont().deriveFont(16f));
//        BRANCH_COMBOBOX.setForeground(Color.white);
//        layout.putConstraint(SpringLayout.WEST, BRANCH_COMBOBOX, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(BRANCH_COMBOBOX);
        labelCons.setX(Spring.constant(320));
        labelCons.setY(Spring.constant(30));
        background.add(BRANCH_COMBOBOX);

//        BRANCH1_CHECKBOX = new JCheckBox("Branch I");
//        BRANCH1_CHECKBOX.setFont(BRANCH1_CHECKBOX.getFont().deriveFont(16f));
//        BRANCH1_CHECKBOX.setForeground(Color.white);
//        layout.putConstraint(SpringLayout.WEST, BRANCH1_CHECKBOX, 5, SpringLayout.WEST, background);
//        labelCons = layout.getConstraints(BRANCH1_CHECKBOX);
//        labelCons.setX(Spring.constant(100));
//        labelCons.setY(Spring.constant(30));
//        background.add(BRANCH1_CHECKBOX);
//
//        BRANCH2_CHECKBOX = new JCheckBox("Branch II");
//        BRANCH2_CHECKBOX.setFont(BRANCH2_CHECKBOX.getFont().deriveFont(16f));
//        BRANCH2_CHECKBOX.setForeground(Color.white);
//        layout.putConstraint(SpringLayout.WEST, BRANCH2_CHECKBOX, 5, SpringLayout.WEST, background);
//        labelCons = layout.getConstraints(BRANCH2_CHECKBOX);
//        labelCons.setX(Spring.constant(250));
//        labelCons.setY(Spring.constant(30));
//        background.add(BRANCH2_CHECKBOX);
//
//        BRANCH3_CHECKBOX = new JCheckBox("Branch III");
//        BRANCH3_CHECKBOX.setFont(BRANCH3_CHECKBOX.getFont().deriveFont(16f));
//        BRANCH3_CHECKBOX.setForeground(Color.white);
//        layout.putConstraint(SpringLayout.WEST, BRANCH3_CHECKBOX, 5, SpringLayout.WEST, background);
//        labelCons = layout.getConstraints(BRANCH3_CHECKBOX);
//        labelCons.setX(Spring.constant(400));
//        labelCons.setY(Spring.constant(30));
//        background.add(BRANCH3_CHECKBOX);
//
//        CHECKBOX_GROUP = new ButtonGroup();
//        CHECKBOX_GROUP.add(BRANCH1_CHECKBOX);
//        CHECKBOX_GROUP.add(BRANCH2_CHECKBOX);
//        CHECKBOX_GROUP.add(BRANCH3_CHECKBOX);

        LECTURER_BUTTON = new JButton("...");
        LECTURER_BUTTON.setFont(LECTURER_BUTTON.getFont().deriveFont(18f));
        layout.putConstraint(SpringLayout.WEST, LECTURER_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(LECTURER_BUTTON);
        labelCons.setX(Spring.constant(320));
        labelCons.setY(Spring.constant(100));
        background.add(LECTURER_BUTTON);

        STUDENT_BUTTON = new JButton("...");
        STUDENT_BUTTON.setFont(STUDENT_BUTTON.getFont().deriveFont(18f));
        layout.putConstraint(SpringLayout.WEST, STUDENT_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(STUDENT_BUTTON);
        labelCons.setX(Spring.constant(320));
        labelCons.setY(Spring.constant(140));
        background.add(STUDENT_BUTTON);

        COLLEGE_BRANCH_BUTTON = new JButton("...");
        COLLEGE_BRANCH_BUTTON.setFont(COLLEGE_BRANCH_BUTTON.getFont().deriveFont(18f));
        layout.putConstraint(SpringLayout.WEST, COLLEGE_BRANCH_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COLLEGE_BRANCH_BUTTON);
        labelCons.setX(Spring.constant(320));
        labelCons.setY(Spring.constant(180));
        background.add(COLLEGE_BRANCH_BUTTON);

        COURSES_BUTTON = new JButton("...");
        COURSES_BUTTON.setFont(COURSES_BUTTON.getFont().deriveFont(18f));
        layout.putConstraint(SpringLayout.WEST, COURSES_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_BUTTON);
        labelCons.setX(Spring.constant(320));
        labelCons.setY(Spring.constant(220));
        background.add(COURSES_BUTTON);

        MODULE_BUTTON = new JButton("...");
        MODULE_BUTTON.setFont(MODULE_BUTTON.getFont().deriveFont(18f));
        layout.putConstraint(SpringLayout.WEST, MODULE_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(MODULE_BUTTON);
        labelCons.setX(Spring.constant(320));
        labelCons.setY(Spring.constant(260));
        background.add(MODULE_BUTTON);
//
//        FEES_BUTTON = new JButton("...");
//        FEES_BUTTON.setFont(FEES_BUTTON.getFont().deriveFont(18f));
//        layout.putConstraint(SpringLayout.WEST, FEES_BUTTON, 5, SpringLayout.WEST, background);
//        labelCons = layout.getConstraints(FEES_BUTTON);
//        labelCons.setX(Spring.constant(320));
//        labelCons.setY(Spring.constant(300));
//        background.add(FEES_BUTTON);

//        ENROLMENT_BUTTON = new JButton("...");
//        ENROLMENT_BUTTON.setFont(ENROLMENT_BUTTON.getFont().deriveFont(18f));
//        layout.putConstraint(SpringLayout.WEST, ENROLMENT_BUTTON, 5, SpringLayout.WEST, background);
//        labelCons = layout.getConstraints(ENROLMENT_BUTTON);
//        labelCons.setX(Spring.constant(320));
//        labelCons.setY(Spring.constant(340));
//        background.add(ENROLMENT_BUTTON);

        LECTURER_BUTTON.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    LecturerRegistration lecturerRegistration = new LecturerRegistration(); //creates a frame
                    lecturerRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
                    lecturerRegistration.setResizable(false); //prevent frame from being resized
                    lecturerRegistration.setSize(800, 533); //sets the x-dimension, and y-dimension of frame
                    lecturerRegistration.setVisible(true); //make frame visible
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });


        STUDENT_BUTTON.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    StudentRegistration studentRegistration = new StudentRegistration(); //creates a frame
                    studentRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
                    studentRegistration.setResizable(false); //prevent frame from being resized
                    studentRegistration.setSize(800, 533); //sets the x-dimension, and y-dimension of frame
                    studentRegistration.setVisible(true); //make frame visible


//                    Person alexson = new Person("Alexson", "Silva", "alexsonsilva@gmail.com", "21643", "1234");
//                    Person val = new Person("Valeria", "Paz", "val@gmail.com", "1234", "1234");
//                    Person marcus = new Person("Marcus", "Moura", "marcus@gmail.com", "5678", "1234");
//
//                    registration.addPerson(alexson);
//                    registration.addPerson(val);
//                    registration.addPerson(marcus);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        COURSES_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    CourseRegistration courseRegistration = new CourseRegistration();
                    courseRegistration.setResizable(false);
                    courseRegistration.setSize(new Dimension(800, 533));
                    courseRegistration.setVisible(true);


                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });


        COLLEGE_BRANCH_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    BranchRegistration branchRegistration = new BranchRegistration();
                    branchRegistration.setResizable(false);
                    branchRegistration.setSize(new Dimension(800, 533));
                    branchRegistration.setVisible(true);


                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        MODULE_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    ModuleRegistration moduleRegistration = new ModuleRegistration();
                    moduleRegistration.setResizable(false);
                    moduleRegistration.setSize(new Dimension(800, 533));
                    moduleRegistration.setVisible(true);


                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
    }
}
