package com.company.alexson;

import javax.swing.*;

public class ExamsPage_Lecturer extends JFrame{
    private JLabel labelModule;
    private JLabel labelLecturer;
    private JLabel labelDate;
    private JComboBox module;
    private JComboBox lecturerName;
    private JTextField date;
    private JList listExams;
    private JButton buttonSave;
    private JButton buttonUpdate;
    private JButton buttonDelete;
    private JButton buttonClear;
    private JPanel panelExamsLecuter;

    public ExamsPage_Lecturer(){
        super("Exams");

        this.setContentPane(this.panelExamsLecuter);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,533);
        this.setResizable(false);
    }
}
