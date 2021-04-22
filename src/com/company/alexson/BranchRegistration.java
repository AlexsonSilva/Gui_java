package com.company.alexson;

import javax.swing.*;

public class BranchRegistration extends JFrame{
    private JPanel panelBranchRegistration;
    private JTextField unit;
    private JTextField address;
    private JLabel labelUnit;
    private JLabel labelAddress;
    private JList listBranch;
    private JButton buttonSave;
    private JButton buttonUpdate;
    private JButton buttonDelete;
    private JButton buttonClear;

    public BranchRegistration(){
        super("Branch Registration");

        this.setContentPane(this.panelBranchRegistration);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,533);
        this.setResizable(false);
    }
}
