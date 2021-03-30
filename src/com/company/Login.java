package com.company;

import javax.swing.*;

public class Login extends JFrame {

    private final JLabel USERNAME_LABEL;
    private final JLabel PASSWORD_LABEL;
    private final JLabel OPTION_LABEL;
    private final JTextField USERNAME_FIELD;
    private final JTextField PASSWORD_FIELD;
    private final JComboBox<String> OPTION_COMBOBOX;
    private final JButton SUBMIT_BUTTON;


    private final String[] loginOption = {"Adm", "Student",
            "Lecturer"};

    public Login() {

        JLabel background=new JLabel(new ImageIcon(getClass().getResource("login.jpg")));

        add(background);

        SpringLayout layout = new SpringLayout();
        background.setLayout(layout);

        USERNAME_LABEL = new JLabel("Username:");
        layout.putConstraint(SpringLayout.WEST, USERNAME_LABEL, 5, SpringLayout.WEST, background);
        SpringLayout.Constraints labelCons = layout.getConstraints(USERNAME_LABEL);
        labelCons.setX(Spring.constant(15));
        labelCons.setY(Spring.constant(300));
        background.add(USERNAME_LABEL);

        PASSWORD_LABEL = new JLabel("Password:");
        layout.putConstraint(SpringLayout.WEST, PASSWORD_LABEL, 25, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(PASSWORD_LABEL);
        labelCons.setX(Spring.constant(15));
        labelCons.setY(Spring.constant(325));
        background.add(PASSWORD_LABEL);

        OPTION_LABEL = new JLabel("Login as:");
       layout.putConstraint(SpringLayout.WEST, OPTION_LABEL, 25, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(OPTION_LABEL);
        labelCons.setX(Spring.constant(15));
        labelCons.setY(Spring.constant(350));
        background.add(OPTION_LABEL);

        USERNAME_FIELD = new JTextField("", 10);
        layout.putConstraint(SpringLayout.WEST, USERNAME_FIELD, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(USERNAME_FIELD);
        labelCons.setX(Spring.constant(105));
        labelCons.setY(Spring.constant(300));
        background.add(USERNAME_FIELD);

        PASSWORD_FIELD = new JTextField("", 10);
        layout.putConstraint(SpringLayout.WEST, PASSWORD_FIELD, 25, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(PASSWORD_FIELD);
        labelCons.setX(Spring.constant(105));
        labelCons.setY(Spring.constant(325));
        background.add(PASSWORD_FIELD);

        OPTION_COMBOBOX = new JComboBox<String>(loginOption);
        layout.putConstraint(SpringLayout.WEST, OPTION_COMBOBOX, 25, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(OPTION_COMBOBOX);
        labelCons.setX(Spring.constant(105));
        labelCons.setY(Spring.constant(350));
        background.add(OPTION_COMBOBOX);

        SUBMIT_BUTTON = new JButton("Submit");
        layout.putConstraint(SpringLayout.WEST, SUBMIT_BUTTON, 25, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(SUBMIT_BUTTON);
        labelCons.setX(Spring.constant(105));
        labelCons.setY(Spring.constant(375));
        background.add(SUBMIT_BUTTON);

    }


}
