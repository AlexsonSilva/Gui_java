package com.company.alexson;

import javax.swing.*;

public class CourseRegistration extends JFrame{
    private JComboBox collegeBranch;
    private JTextField price;
    private JTextField name;
    private JList listCourse;
    private JPanel panelCourseRegistration;
    private JButton buttonSave;
    private JButton buttonUpdate;
    private JButton buttonDelete;
    private JButton buttonClear;
    private JLabel labelCollegeBranch;
    private JLabel labelCourseName;
    private JLabel labelPrice;

    public CourseRegistration(){
        super("Course Registration");

        this.setContentPane(this.panelCourseRegistration);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,533);
        this.setResizable(false);
    }
}
