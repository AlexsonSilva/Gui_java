package com.company.alexson;

import javax.swing.*;

public class GradesPage_Student extends JFrame{
    private JComboBox module;
    private JLabel labelModule;
    private JList listGrades;
    private JButton buttonQuit;
    private JPanel panelGradesStudent;

    public GradesPage_Student(){
        super("Student Grades");

        this.setContentPane(this.panelGradesStudent);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,533);
        this.setResizable(false);
    }
}
