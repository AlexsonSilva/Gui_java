package com.company;

import javax.swing.*;
import java.awt.*;

public class StudentRegistration extends JFrame{
    private final JLabel formLabel;
    private final JLabel idLabel;
    private final JLabel fNLabel;
    private final JLabel lNLabel;
    private final JLabel genderLabel;
    private final JLabel birthDateLabel;
    private final JLabel phoneLabel;
    private final JLabel addressLabel;
    private final JLabel cityLabel;
    private final JLabel emailLabel;
    private final JLabel passwordLabel;

    private final JTextField idTextField;
    private final JTextField fNTextField;
    private final JTextField lNTextField;
    private final JCheckBox maleCheckBox;
    private final JCheckBox femaleCheckBox;
    private final ButtonGroup checkBoxGroup;
    private final JTextField birthDateTextField;
    private final JTextField phoneTextField;
    private final JTextField addressTextField;
    private final JTextField cityTextField;
    private final JTextField emailTextField;
    private final JTextField passwordTextField;

    private final JButton submitButton;
    private final JButton clearButton;

    public StudentRegistration(){
        super("Student Registration");

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        setLayout(null);
        Insets insets = panel.getInsets();
        Dimension size = panel.getPreferredSize();
        panel.setBounds(0 + insets.left, 0 + insets.top,
                450, 30);


        formLabel = new JLabel("Registration Form");
        formLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        formLabel.setForeground(Color.white);
        setLayout(null);
        insets = formLabel.getInsets();
        size = formLabel.getPreferredSize();
        formLabel.setBounds(150 + insets.left, 5 + insets.top,
                size.width, size.height);
        add(formLabel);
        add(panel);

        idLabel = new JLabel("Student ID:");
        setLayout(null);
        insets = idLabel.getInsets();
        size = idLabel.getPreferredSize();
        idLabel.setBounds(25 + insets.left, 55 + insets.top,
                size.width, size.height);
        add(idLabel);

        fNLabel = new JLabel("First Name:");
        setLayout(null);
        insets = fNLabel.getInsets();
        size = fNLabel.getPreferredSize();
        fNLabel.setBounds(25 + insets.left, 85 + insets.top,
                size.width, size.height);
        add(fNLabel);

        lNLabel = new JLabel("Last Name:");
        setLayout(null);
        insets = lNLabel.getInsets();
        size = lNLabel.getPreferredSize();
        lNLabel.setBounds(25 + insets.left, 115 + insets.top,
                size.width, size.height);
        add(lNLabel);

        genderLabel = new JLabel("Gender:");
        setLayout(null);
        insets = genderLabel.getInsets();
        size = genderLabel.getPreferredSize();
        genderLabel.setBounds(25 + insets.left, 145 + insets.top,
                size.width, size.height);
        add(genderLabel);

        birthDateLabel = new JLabel("Birth Date:");
        setLayout(null);
        insets = birthDateLabel.getInsets();
        size = birthDateLabel.getPreferredSize();
        birthDateLabel.setBounds(25 + insets.left, 175 + insets.top,
                size.width, size.height);
        add(birthDateLabel);

        phoneLabel = new JLabel("Phone Number:");
        setLayout(null);
        insets = phoneLabel.getInsets();
        size = phoneLabel.getPreferredSize();
        phoneLabel.setBounds(25 + insets.left, 205 + insets.top,
                size.width, size.height);
        add(phoneLabel);

        addressLabel = new JLabel("Address:");
        setLayout(null);
        insets = addressLabel.getInsets();
        size = addressLabel.getPreferredSize();
        addressLabel.setBounds(25 + insets.left, 235 + insets.top,
                size.width, size.height);
        add(addressLabel);

        cityLabel = new JLabel("City:");
        setLayout(null);
        insets = cityLabel.getInsets();
        size = cityLabel.getPreferredSize();
        cityLabel.setBounds(25 + insets.left, 265 + insets.top,
                size.width, size.height);
        add(cityLabel);

        emailLabel = new JLabel("Email Address:");
        setLayout(null);
        insets = emailLabel.getInsets();
        size = emailLabel.getPreferredSize();
        emailLabel.setBounds(25 + insets.left, 295 + insets.top,
                size.width, size.height);
        add(emailLabel);

        passwordLabel = new JLabel("Password:");
        setLayout(null);
        insets = passwordLabel.getInsets();
        size = passwordLabel.getPreferredSize();
        passwordLabel.setBounds(25 + insets.left, 325 + insets.top,
                size.width, size.height);
        add(passwordLabel);

        //Add TextField
        idTextField = new JTextField();
        setLayout(null);
        insets = idTextField.getInsets();
        size = idTextField.getPreferredSize();
        idTextField.setBounds(150 + insets.left, 45 + insets.top,
                80, size.height);
        add(idTextField);

        fNTextField = new JTextField();
        setLayout(null);
        insets = fNTextField.getInsets();
        size = fNTextField.getPreferredSize();
        fNTextField.setBounds(150 + insets.left, 75 + insets.top,
                200, size.height);
        add(fNTextField);

        lNTextField = new JTextField();
        setLayout(null);
        insets = lNTextField.getInsets();
        size = lNTextField.getPreferredSize();
        lNTextField.setBounds(150 + insets.left, 105 + insets.top,
                200, size.height);
        add(lNTextField);

        birthDateTextField = new JTextField();
        setLayout(null);
        insets = birthDateTextField.getInsets();
        size = birthDateTextField.getPreferredSize();
        birthDateTextField.setBounds(150 + insets.left, 165 + insets.top,
                105, size.height);
        add(birthDateTextField);

        phoneTextField = new JTextField();
        setLayout(null);
        insets = phoneTextField.getInsets();
        size = phoneTextField.getPreferredSize();
        phoneTextField.setBounds(150 + insets.left, 195 + insets.top,
                105, size.height);
        add(phoneTextField);

        addressTextField = new JTextField();
        setLayout(null);
        insets = addressTextField.getInsets();
        size = addressTextField.getPreferredSize();
        addressTextField.setBounds(150 + insets.left, 225 + insets.top,
                250, size.height);
        add(addressTextField);

        cityTextField = new JTextField();
        setLayout(null);
        insets = cityTextField.getInsets();
        size = cityTextField.getPreferredSize();
        cityTextField.setBounds(150 + insets.left, 255 + insets.top,
                105, size.height);
        add(cityTextField);

        emailTextField = new JTextField();
        setLayout(null);
        insets = emailTextField.getInsets();
        size = emailTextField.getPreferredSize();
        emailTextField.setBounds(150 + insets.left, 285 + insets.top,
                250, size.height);
        add(emailTextField);

        passwordTextField = new JTextField();
        setLayout(null);
        insets = passwordTextField.getInsets();
        size = passwordTextField.getPreferredSize();
        passwordTextField.setBounds(150 + insets.left, 315 + insets.top,
                105, size.height);
        add(passwordTextField);

        //Add Button
        submitButton = new JButton("Submit");
        setLayout(null);
        insets = submitButton.getInsets();
        size = submitButton.getPreferredSize();
        submitButton.setBounds(130 + insets.left,370 + insets.top,
                size.width, size.height);
        add(submitButton);

        clearButton = new JButton("Clear");
        setLayout(null);
        insets = clearButton.getInsets();
        size = clearButton.getPreferredSize();
        clearButton.setBounds(230 + insets.left,370 + insets.top,
                size.width, size.height);
        add(clearButton);

        //Add CheckBox
        maleCheckBox = new JCheckBox("Male");
        setLayout(null);
        insets = maleCheckBox.getInsets();
        size = maleCheckBox.getPreferredSize();
        maleCheckBox.setBounds(150 + insets.left, 135 + insets.top,
                105, size.height);
        add(maleCheckBox);

        femaleCheckBox = new JCheckBox("Female");
        setLayout(null);
        insets = femaleCheckBox.getInsets();
        size = femaleCheckBox.getPreferredSize();
        femaleCheckBox.setBounds(230 + insets.left, 135 + insets.top,
                105, size.height);
        add(femaleCheckBox);

        checkBoxGroup = new ButtonGroup();
        checkBoxGroup.add(maleCheckBox);
        checkBoxGroup.add(femaleCheckBox);

    }

}
