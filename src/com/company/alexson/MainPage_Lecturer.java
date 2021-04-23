package com.company.alexson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage_Lecturer extends JFrame {

    private final JButton ASSIGNMENTS_BUTTON;
    private final JButton GRADES_BUTTON;
    private final JButton TIMETABLE_BUTTON;
    private final JButton ATTENDANCE_BUTTON;
    private final JButton EXAM_DATE_BUTTON;
    private final JButton COURSES_BUTTON;

    private final JLabel ASSIGNMENTS_LABEL;
    private final JLabel GRADES_LABEL;
    private final JLabel TIMETABLE_LABEL;
    private final JLabel ATTENDANCE_LABEL;
    private final JLabel EXAMDATES_LABEL;
    private final JLabel COURSES_LABEL;

    public MainPage_Lecturer(){
        super("Main Page Lecturer");

        JLabel background=new JLabel(new ImageIcon(getClass().getResource("images/main_bk.jpeg")));
        add(background);

        SpringLayout layout = new SpringLayout();
        background.setLayout(layout);

        ASSIGNMENTS_BUTTON = new JButton(new ImageIcon(getClass().getResource("images/assignment_bk.jpeg")));
        layout.putConstraint(SpringLayout.WEST, ASSIGNMENTS_BUTTON, 5, SpringLayout.WEST, background);
        SpringLayout.Constraints labelCons = layout.getConstraints(ASSIGNMENTS_BUTTON);
        labelCons.setX(Spring.constant(150));
        labelCons.setY(Spring.constant(75));
        labelCons.setWidth(Spring.constant(150));
        labelCons.setHeight(Spring.constant(150));
        background.add(ASSIGNMENTS_BUTTON);

        ASSIGNMENTS_LABEL = new JLabel("Assignments");
        ASSIGNMENTS_LABEL.setFont(ASSIGNMENTS_LABEL.getFont().deriveFont(18f));
        ASSIGNMENTS_LABEL.setForeground(Color.decode("#22469b"));
        layout.putConstraint(SpringLayout.WEST, ASSIGNMENTS_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(ASSIGNMENTS_LABEL);
        labelCons.setX(Spring.constant(170));
        labelCons.setY(Spring.constant(50));
        background.add(ASSIGNMENTS_LABEL);

        GRADES_BUTTON = new JButton(new ImageIcon(getClass().getResource("images/grades_bk.jpeg")));
        layout.putConstraint(SpringLayout.WEST, GRADES_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(GRADES_BUTTON);
        labelCons.setX(Spring.constant(325));
        labelCons.setY(Spring.constant(75));
        labelCons.setWidth(Spring.constant(150));
        labelCons.setHeight(Spring.constant(150));
        background.add(GRADES_BUTTON);

        GRADES_LABEL = new JLabel("Grades");
        GRADES_LABEL.setFont(GRADES_LABEL.getFont().deriveFont(18f));
        GRADES_LABEL.setForeground(Color.decode("#22469b"));
        layout.putConstraint(SpringLayout.WEST, GRADES_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(GRADES_LABEL);
        labelCons.setX(Spring.constant(370));
        labelCons.setY(Spring.constant(50));
        background.add(GRADES_LABEL);

        TIMETABLE_BUTTON = new JButton(new ImageIcon(getClass().getResource("images/timetable_bk.jpeg")));
        layout.putConstraint(SpringLayout.WEST, TIMETABLE_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(TIMETABLE_BUTTON);
        labelCons.setX(Spring.constant(500));
        labelCons.setY(Spring.constant(75));
        labelCons.setWidth(Spring.constant(150));
        labelCons.setHeight(Spring.constant(150));
        background.add(TIMETABLE_BUTTON);

        TIMETABLE_LABEL = new JLabel("Timetable");
        TIMETABLE_LABEL.setFont(TIMETABLE_LABEL.getFont().deriveFont(18f));
        TIMETABLE_LABEL.setForeground(Color.decode("#22469b"));
        layout.putConstraint(SpringLayout.WEST, TIMETABLE_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(TIMETABLE_LABEL);
        labelCons.setX(Spring.constant(530));
        labelCons.setY(Spring.constant(50));
        background.add(TIMETABLE_LABEL);

        ATTENDANCE_BUTTON = new JButton(new ImageIcon(getClass().getResource("images/attendance_bk.jpeg")));
        layout.putConstraint(SpringLayout.WEST, ATTENDANCE_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(ATTENDANCE_BUTTON);
        labelCons.setX(Spring.constant(150));
        labelCons.setY(Spring.constant(270));
        labelCons.setWidth(Spring.constant(150));
        labelCons.setHeight(Spring.constant(150));
        background.add(ATTENDANCE_BUTTON);

        ATTENDANCE_LABEL = new JLabel("Attendance");
        ATTENDANCE_LABEL.setFont(ATTENDANCE_LABEL.getFont().deriveFont(18f));
        ATTENDANCE_LABEL.setForeground(Color.decode("#22469b"));
        layout.putConstraint(SpringLayout.WEST, ATTENDANCE_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(ATTENDANCE_LABEL);
        labelCons.setX(Spring.constant(180));
        labelCons.setY(Spring.constant(240));
        background.add(ATTENDANCE_LABEL);

        EXAM_DATE_BUTTON = new JButton(new ImageIcon(getClass().getResource("images/examdates_bk.jpeg")));
        layout.putConstraint(SpringLayout.WEST, EXAM_DATE_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(EXAM_DATE_BUTTON);
        labelCons.setX(Spring.constant(325));
        labelCons.setY(Spring.constant(270));
        labelCons.setWidth(Spring.constant(150));
        labelCons.setHeight(Spring.constant(150));
        background.add(EXAM_DATE_BUTTON);

        EXAMDATES_LABEL = new JLabel("Exam Dates");
        EXAMDATES_LABEL.setFont(EXAMDATES_LABEL.getFont().deriveFont(18f));
        EXAMDATES_LABEL.setForeground(Color.decode("#22469b"));
        layout.putConstraint(SpringLayout.WEST, EXAMDATES_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(EXAMDATES_LABEL);
        labelCons.setX(Spring.constant(350));
        labelCons.setY(Spring.constant(240));
        background.add(EXAMDATES_LABEL);

        COURSES_BUTTON = new JButton(new ImageIcon(getClass().getResource("images/courses_bk.jpeg")));
        layout.putConstraint(SpringLayout.WEST, COURSES_BUTTON, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_BUTTON);
        labelCons.setX(Spring.constant(500));
        labelCons.setY(Spring.constant(270));
        labelCons.setWidth(Spring.constant(150));
        labelCons.setHeight(Spring.constant(150));
        background.add(COURSES_BUTTON);

        COURSES_LABEL = new JLabel("Courses");
        COURSES_LABEL.setFont(COURSES_LABEL.getFont().deriveFont(18f));
        COURSES_LABEL.setForeground(Color.decode("#22469b"));
        layout.putConstraint(SpringLayout.WEST, COURSES_LABEL, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(COURSES_LABEL);
        labelCons.setX(Spring.constant(540));
        labelCons.setY(Spring.constant(240));
        background.add(COURSES_LABEL);

        ASSIGNMENTS_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    AssignmentPage_Lecturer assignmentPage_lecturer = new AssignmentPage_Lecturer(); //creates a frame
                    assignmentPage_lecturer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
                    assignmentPage_lecturer.setResizable(false); //prevent frame from being resized
                    assignmentPage_lecturer.setSize(800, 533); //sets the x-dimension, and y-dimension of frame
                    assignmentPage_lecturer.setVisible(true); //make frame visible

//                    MyCalendar myCalendar = new MyCalendar(new DataModel());
//                    myCalendar.setResizable(false);
//                    myCalendar.setSize(new Dimension(500, 750));
//                    myCalendar.setVisible(true);

//                    StudentCalendar studentCalendar = new StudentCalendar(new DataModel());
//                    studentCalendar.setResizable(false);
//                    studentCalendar.setSize(new Dimension(500, 750));
//                    studentCalendar.setVisible(true);

                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        EXAM_DATE_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    ExamsPage_Lecturer examsPageLecturer = new ExamsPage_Lecturer(); //creates a frame
                    examsPageLecturer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
                    examsPageLecturer.setResizable(false); //prevent frame from being resized
                    examsPageLecturer.setSize(800, 533); //sets the x-dimension, and y-dimension of frame
                    examsPageLecturer.setVisible(true); //make frame visible

                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        GRADES_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    GradesPage_Lecturer gradesPage_lecturer = new GradesPage_Lecturer(); //creates a frame
                    gradesPage_lecturer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
                    gradesPage_lecturer.setResizable(false); //prevent frame from being resized
                    gradesPage_lecturer.setSize(800, 533); //sets the x-dimension, and y-dimension of frame
                    gradesPage_lecturer.setVisible(true); //make frame visible

                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
    }

}
