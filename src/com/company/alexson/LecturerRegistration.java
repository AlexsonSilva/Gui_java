package com.company.alexson;

import javax.swing.*;

public class LecturerRegistration extends JFrame{
    private JPanel panelLecturerRegistration;
    private JTextField lecturerId;
    private JLabel labelLecturerId;
    private JLabel labelFirstName;
    private JLabel labelLastName;
    private JLabel labelGender;
    private JLabel labelPhone;
    private JLabel labelDob;
    private JLabel labelEmail;
    private JLabel labelUsername;
    private JLabel labelPassword;
    private JLabel labelModule;
    private JLabel labelCollegeBranch;
    private JTextField first_name;
    private JTextField last_name;
    private JComboBox gender;
    private JTextField phone;
    private JTextField dob;
    private JTextField email;
    private JTextField username;
    private JPasswordField password;
    private JComboBox module;
    private JComboBox collegeBranch;
    private JList listLecturer;
    private JButton buttonSave;
    private JButton buttonUpdate;
    private JButton buttonDelete;
    private JButton buttonClear;

    public LecturerRegistration(){

        super("Lecturer Registration");

        this.setContentPane(this.panelLecturerRegistration);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,533);
        this.setResizable(false);
    }
}
