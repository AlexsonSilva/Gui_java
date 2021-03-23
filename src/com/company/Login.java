package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Login extends JFrame {

    private final JLabel usernameLabel;
    private final JLabel passwordLabel;
    private final JLabel optionLabel;
    private final JTextField usernameField;
    private final JTextField passwordField;
    private final JComboBox<String> optionComboBox;
    private final JButton submitButton;


    private final String[] loginOption = {"Student",
    "Lecturer"};


    public Login() {
        super("Login");

        JPanel panel = new JPanel();
        add(panel);

        ImageIcon image = new ImageIcon(getClass().getResource("login.jpg"));
        JLabel l = new JLabel(image);
        panel.setLayout(new BorderLayout());
        add(l);



        add(panel);

        usernameLabel = new JLabel("Username:");
        setLayout(null);
        Insets insets = usernameLabel.getInsets();
        Dimension size = usernameLabel.getPreferredSize();
        usernameLabel.setBounds(25 + insets.left, 700 + insets.top,
                size.width, size.height);
        add(usernameLabel);



        passwordLabel = new JLabel("Password:");
        setLayout(null);
        insets = passwordLabel.getInsets();
        size = passwordLabel.getPreferredSize();
        passwordLabel.setBounds(25 + insets.left, 730 + insets.top,
                size.width, size.height);
        add(passwordLabel);

        optionLabel = new JLabel("Login as:");
        setLayout(null);
        insets = optionLabel.getInsets();
        size = optionLabel.getPreferredSize();
        optionLabel.setBounds(25 + insets.left, 760 + insets.top,
                size.width, size.height);
        add(optionLabel);

        usernameField = new JTextField();
        setLayout(null);
        insets = usernameField.getInsets();
        size = usernameField.getPreferredSize();
        usernameField.setBounds(105 + insets.left, 690 + insets.top,
                125, size.height);
        add(usernameField);

        passwordField= new JTextField();
        setLayout(null);
        insets = passwordField.getInsets();
        size = passwordField.getPreferredSize();
        passwordField.setBounds(105 + insets.left, 720 + insets.top,
                125, size.height);
        add(passwordField);

        optionComboBox = new JComboBox<String>(loginOption);
        setLayout(null);
        insets = optionComboBox.getInsets();
        size = optionComboBox.getPreferredSize();
        optionComboBox.setBounds(110 + insets.left, 750 + insets.top,
                130, size.height);
        add(optionComboBox);

        submitButton = new JButton("Submit");
        setLayout(null);
        insets = submitButton.getInsets();
        size = submitButton.getPreferredSize();
        submitButton.setBounds(90 + insets.left,780 + insets.top,
                size.width, size.height);
        add(submitButton);




    }


}
