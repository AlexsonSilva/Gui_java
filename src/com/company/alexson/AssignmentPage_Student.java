package com.company.alexson;

import javax.swing.*;

public class AssignmentPage_Student extends JFrame{
    private JLabel labelModule;
    private JComboBox module;
    private JList list1;
    private JButton buttonQuit;
    private JPanel panelAssignmentPageStudent;
    private JPanel panelModule;
    private JPanel panelbody;

    public AssignmentPage_Student(){
        super("Assignments");

        this.setContentPane(this.panelAssignmentPageStudent);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,533);
        this.setResizable(false);
    }
}
