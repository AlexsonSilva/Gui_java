package com.company.alexson;

import javax.swing.*;

public class ModuleRegistration extends JFrame {
    private JPanel panelModuleRegistration;
    private JLabel labelBranch;
    private JLabel labelCourse;
    private JLabel labelLecturer;
    private JLabel labelSubject;
    private JLabel labelWeekDay;
    private JLabel labelClassHour;
    private JComboBox collegeBranch;
    private JComboBox course;
    private JComboBox lecturer;
    private JTextField subject;
    private JTextField weekDay;
    private JTextField classHour;
    private JList listModules;
    private JButton buttonSave;
    private JButton buttonUpdate;
    private JButton buttonDelete;
    private JButton buttonClear;

    public ModuleRegistration() {
        super("Module Registration");

        this.setContentPane(this.panelModuleRegistration);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 533);
        this.setResizable(false);
    }
}