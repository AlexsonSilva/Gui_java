package com.company.alexson;

import javax.swing.*;

public class StudentRegistration extends JFrame{
    private JPanel panelStudentRegistration;
    private JLabel labelStudentId;
    private JLabel labelFirstName;
    private JLabel labelLastName;
    private JLabel labelGender;
    private JLabel labelPhone;
    private JLabel labelDob;
    private JLabel labelEmail;
    private JLabel labelPassword;
    private JLabel labelCollegeBranch;
    private JLabel labelCourse;
    private JLabel labelPayFull;
    private JTextField id;
    private JTextField first_name;
    private JTextField last_name;
    private JComboBox gender;
    private JTextField phone;
    private JTextField dob;
    private JTextField emailAddress;
    private JPasswordField password;
    private JComboBox collegeBranch;
    private JComboBox course;
    private JButton buttonSave;
    private JButton buttonUpdate;
    private JButton buttonDelete;
    private JButton buttonClear;
    private JComboBox isPaidFull;
    private JList listStudent;

    public StudentRegistration(){
        super("Student Registration");

        this.setContentPane(this.panelStudentRegistration);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,533);
        this.setResizable(false);
    }
}
