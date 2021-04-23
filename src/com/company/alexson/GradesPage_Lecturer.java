package com.company.alexson;

import javax.swing.*;

public class GradesPage_Lecturer extends JFrame{
    private JLabel labelCollegeBranch;
    private JLabel labelModule;
    private JLabel labelStudent;
    private JLabel labelGrade;
    private JComboBox collegeBranch;
    private JComboBox module;
    private JComboBox comboBox3;
    private JTextField grade;
    private JList listStudent;
    private JButton buttonSave;
    private JButton buttonUpdate;
    private JButton buttonDelete;
    private JButton buttonClear;
    private JPanel panelGradesLecturer;

    public GradesPage_Lecturer(){
        super("Student Grades");

        this.setContentPane(this.panelGradesLecturer);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,533);
        this.setResizable(false);
    }
}
