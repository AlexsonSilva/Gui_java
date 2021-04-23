package com.company.alexson;

import javax.swing.*;

public class AssignmentPage_Lecturer extends JFrame{
    private JLabel labelLecturer;
    private JLabel labelModule;
    private JLabel labelDueDate;
    private JLabel labelDescription;
    private JComboBox module;
    private JTextField textField1;
    private JTextArea description;
    private JList listAssignments;
    private JButton buttonSave;
    private JButton buttonUpdate;
    private JButton buttonDelete;
    private JButton buttonClear;
    private JLabel lecturerName;
    private JPanel panelAssignmentsPage;
    private JPanel panelAssignmentPage;

    public AssignmentPage_Lecturer(){
            super("Assignments");

            this.setContentPane(this.panelAssignmentsPage);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(800,533);
            this.setResizable(false);
    }
}
