package com.company;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    private final JLabel usernameLabel;
    private final JLabel passwordLabel;
    private final JLabel optionLabel;
    private final JTextField usernameField;
    private final JTextField passwordField;
    private final JComboBox<String> optionComboBox;
    private final JButton submitButton;


    private final String[] loginOption = {"Adm", "Student",
            "Lecturer"};

    public Login() {

        JLabel background=new JLabel(new ImageIcon(getClass().getResource("login.jpg")));

        add(background);

        SpringLayout layout = new SpringLayout();
        background.setLayout(layout);

        usernameLabel = new JLabel("Username:");
        layout.putConstraint(SpringLayout.WEST, usernameLabel, 5, SpringLayout.WEST, background);
        SpringLayout.Constraints labelCons = layout.getConstraints(usernameLabel);
        labelCons.setX(Spring.constant(15));
        labelCons.setY(Spring.constant(300));
        background.add(usernameLabel);

        passwordLabel = new JLabel("Password:");
        layout.putConstraint(SpringLayout.WEST, passwordLabel, 25, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(passwordLabel);
        labelCons.setX(Spring.constant(15));
        labelCons.setY(Spring.constant(325));
        background.add(passwordLabel);

        optionLabel = new JLabel("Login as:");
       layout.putConstraint(SpringLayout.WEST, optionLabel, 25, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(optionLabel);
        labelCons.setX(Spring.constant(15));
        labelCons.setY(Spring.constant(350));
        background.add(optionLabel);

        usernameField = new JTextField("", 10);
        layout.putConstraint(SpringLayout.WEST, usernameField, 5, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(usernameField);
        labelCons.setX(Spring.constant(105));
        labelCons.setY(Spring.constant(300));
        background.add(usernameField);

        passwordField= new JTextField("", 10);
        layout.putConstraint(SpringLayout.WEST, passwordField, 25, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(passwordField);
        labelCons.setX(Spring.constant(105));
        labelCons.setY(Spring.constant(325));
        background.add(passwordField);

        optionComboBox = new JComboBox<String>(loginOption);
        layout.putConstraint(SpringLayout.WEST, optionComboBox, 25, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(optionComboBox);
        labelCons.setX(Spring.constant(105));
        labelCons.setY(Spring.constant(350));
        background.add(optionComboBox);

        submitButton = new JButton("Submit");
        layout.putConstraint(SpringLayout.WEST, submitButton, 25, SpringLayout.WEST, background);
        labelCons = layout.getConstraints(submitButton);
        labelCons.setX(Spring.constant(105));
        labelCons.setY(Spring.constant(375));
        background.add(submitButton);

    }


}
