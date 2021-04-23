package com.company.alexson;

import javax.swing.*;

public class ExamsPage_Student extends JFrame{
    private JComboBox module;
    private JLabel labelModule;
    private JList list1;
    private JButton buttonQuit;
    private JPanel panelExamsStudent;

    public ExamsPage_Student(){
        super("Exams");

        this.setContentPane(this.panelExamsStudent);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,533);
        this.setResizable(false);
    }
}
